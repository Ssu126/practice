package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;

import java.lang.reflect.Array;
import java.util.*;

public abstract class CacheBasicHeroRepository<T extends Hero> implements CrudRepository<String, T>{
    private final Map<String, T> heroes = new HashMap<>();
    private final BasicHeroRepository<T> database;

    public CacheBasicHeroRepository(BasicHeroRepository<T> database){
        this.database = database;
    }
    @Override
    public T findByKey(String name){
        if(this.heroes.containsKey(name)){
            System.out.println("- 캐시로부터 반환했습니다 : " + name);
            return this.heroes.get(name);
        }
        T retrieveFromDatabase = this.database.findByKey(name);
        if (Objects.isNull(retrieveFromDatabase)){
            System.out.println("- 데이터베이스에 존재하지 않습니다 : " + name);
            return null;
        }
        this.heroes.put(retrieveFromDatabase.getName(), retrieveFromDatabase);
        System.out.println("- 캐시에는 없지만 데이터베이스에는 존재하여 캐시에 싱크 후 반환합니다 : " + name);
        return retrieveFromDatabase;
    }
}
