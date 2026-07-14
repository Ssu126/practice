package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Arrays;

public abstract class CacheBasicHeroRepository<T extends Hero> implements CrudRepository<T>{
    private List<T> heroes = new ArrayList<>();
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
        this.heroes.add(retrieveFromDatabase);
        System.out.println("- 캐시에는 없지만 데이터베이스에는 존재하여 캐시에 싱크 후 반환합니다 : " + name);
        return retrieveFromDatabase;
    }
}
