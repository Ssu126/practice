package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;

import java.lang.reflect.Array;
import java.util.Objects;

public abstract class CacheBasicHeroRepository<T extends Hero> implements CrudRepository<T>{
    private T[] heroes = (T[]) Array.newInstance(Hero.class, 0);
    private final BasicHeroRepository<T> database;

    public CacheBasicHeroRepository(BasicHeroRepository<T> database){
        this.database = database;
    }

    @Override
    public T findByName(String name){
        for(T each : this.heroes){
            if(each.getName().equals(name)){
                System.out.println("- 캐시로부터 반환했습니다 : " + name);
                return each;
            }
        }
        T retrieveFromDatabase = this.database.findByName(name);
        if (Objects.isNull(retrieveFromDatabase)){
            System.out.println("- 데이터베이스에 존재하지 않습니다 : " + name);
            return null;
        }
        T[] newheroes = Arrays.copyOf(heroes, heroes.length+1);
        System.arraycopy(this.heroes, 0, newheroes, this.heroes.length);
        newheroes[this.heroes.length] = retrieveFromDatabase;
        this.heroes = newheroes;
        System.out.println("- 캐시에는 없지만 데이터베이스에는 존재하여 캐시에 싱크 후 반환합니다 : " + name);
        return retrieveFromDatabase;
    }
}
