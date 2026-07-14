package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.StrengthHero;

import java.util.Arrays;

public class StrengthHeroReponsitory extends BasicHeroRepository {
    public StrengthHeroReponsitory(StrengthHero[] heroes){
        super(Arrays.asList(heroes));
    }
}