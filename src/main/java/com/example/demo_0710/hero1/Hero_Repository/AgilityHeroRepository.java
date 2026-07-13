package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;
import com.example.demo_0710.hero1.Hero_interface.Hero;
import com.example.demo_0710.hero1.Hero_interface.BasicHero;

public class AgilityHeroRepository extends BasicRepository {
    @Override
    public Hero findHeroByName(String name){
        for (BasicHero each : basicHeroes){
            if(each.getName().equals(name)){
                return each;
            }
        }
        throw new RuntimeException("당신이 찾는 민첩캐가 없습니다: " + name);
    }
}
