package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.BasicHero;
import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;
import com.example.demo_0710.hero1.Hero_interface.Hero_Type.StrengthHero;
import com.example.demo_0710.hero1.Hero_interface.Hero;
import lombok.Getter;

@Getter
public abstract class BasicRepository implements HeroRepository{
    protected BasicHero[] basicHeroes = new BasicHero[]{
            new AgilityHero("Slark"),
            new AgilityHero("Juggernaut"),
            new AgilityHero("Draw Rangger"),
            new StrengthHero("S1"),
            new StrengthHero("S2"),
            new StrengthHero("S3")
    };

    public void heroCreate(String name){
        basicHeroes
    }

    @Override
    public abstract Hero findHeroByName(String name);
}
