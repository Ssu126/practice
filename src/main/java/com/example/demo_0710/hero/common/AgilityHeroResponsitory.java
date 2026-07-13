package com.example.demo_0710.hero.common;

public class AgilityHeroResponsitory implements HeroRepository{
    private AgilityHero[] agilityHeroes = new AgilityHero[]{
            new AgilityHero("Slark"),
            new AgilityHero("Juggetnaut"),
            new AgilityHero("Draw Ranger")
    };

    @Override
    public Hero findHeroByName(String name){
        for(AgilityHero each : agilityHeroes){
            if(each.getName().equals(name)){
                return each;
            }
        }
        throw new RuntimeException("당신이 찾는 영웅이 없습니다 : " + name);
    }
}
