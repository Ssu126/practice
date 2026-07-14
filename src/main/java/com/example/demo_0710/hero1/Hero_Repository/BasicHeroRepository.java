package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;

import java.util.List;
import java.util.Objects;

public abstract class BasicHeroRepository<T extends  Hero> implements CrudRepository<T> {
    private final List<T> heroes;

    public BasicHeroRepository(List<T> heroes) {
        this.heroes = heroes;
    }

    @Override
    public T findByName(String name) {
        for (T each : this.heroes) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }

    @Override
    public void create(T hero) {
        T retrieve = findByName(hero.getName());
        if (Objects.nonNull(retrieve)) {
            throw new RuntimeException("똑같은 이름의 영웅이 이미 있습니다! - 입력받은 영웅 : " + hero.getName());
        }
        this.heroes.add(retrieve);
    }

    @Override
    public void delete(String name) {
        Hero retrieve = findByName(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 입력받은 영웅 : " + name);
        }
        this.heroes.remove(retrieve);
    }
}
