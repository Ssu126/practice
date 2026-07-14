package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class BasicHeroRepository<V extends  Hero> implements CrudRepository<String, V> {
    private final Map<String, V> heroes = new HashMap<>();

    public BasicHeroRepository(List<V> heroes) {
        for(V hero : heroes){
            this.heroes.put(hero.getName(), hero);
        }
    }

    @Override
    public V findByKey(String name) {
        if (this.heroes.containsKey(name)){
            return this.heroes.get(name);
        }
        return null;
    }

    @Override
    public void create(V hero) {
        V retrieve = this.findByKey(hero.getName());
        if (Objects.nonNull(retrieve)) {
            throw new RuntimeException("똑같은 이름의 영웅이 이미 있습니다! - 받은 영웅 객체의 이름 : " + hero.getName());
        }
        this.heroes.put(hero.getName(), hero);
    }

    @Override
    public void delete(String name) {
        Hero retrieve = findByKey(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 받은 영웅 객체의 이름 : " + name);
        }
        this.heroes.remove(name);
    }
}
