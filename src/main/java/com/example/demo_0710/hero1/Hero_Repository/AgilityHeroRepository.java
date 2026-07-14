package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;

import java.util.Arrays;

public class AgilityHeroRepository extends BasicHeroRepository {
    public AgilityHeroRepository(AgilityHero[] heroes){
        super(Arrays.asList(heroes));
    }
}
