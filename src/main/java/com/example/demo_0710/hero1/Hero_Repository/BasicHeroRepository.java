package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;
import java.util.Objects;

public abstract class BasicHeroRepository<T extends  Hero> implements CrudRepository<T> {
    private T[] heroes;

    public BasicHeroRepository(T[] heroes) {
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
        T[] newheroes = (T[])new Hero[this.heroes.length + 1];
        System.arraycopy(this.heroes, 0, newheroes, 0, this.heroes.length);
        newheroes[this.heroes.length] = hero;
        this.heroes = newheroes;
    }

    @Override
    public void delete(String name) {
        Hero retrieve = findByName(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 입력받은 영웅 : " + name);
        }
        byte found = 0;
        Hero[] newheroes = new Hero[this.heroes.length - 1];
        for (int index = 0; index < this.heroes.length; index++) {
            Hero picked = this.heroes[index];
            if (!picked.getName().equals(name)) {
                newheroes[index - found] = this.heroes[index];
            } else {
                found = 1;
            }
        }
    }
}
