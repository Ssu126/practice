package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;

public class CacheAgilityHeroRepository extends CacheBasicHeroRepository<AgilityHero>{
    public CacheAgilityHeroRepository(AgilityHero[] heroes){
        super(new AgilityHeroRepository(heroes));
    }
}