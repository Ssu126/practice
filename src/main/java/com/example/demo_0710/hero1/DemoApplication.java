package com.example.demo_0710.hero1;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;
import com.example.demo_0710.hero1.Hero_Repository.AgilityHeroRepository;
import com.example.demo_0710.hero1.Hero_Repository.CrudRepository;
import com.example.demo_0710.hero1.Hero_interface.Hero;
import com.example.demo_0710.hero1.GameService.IGameService;
import com.example.demo_0710.hero1.GameService.TwoCoinGameService;
import com.example.demo_0710.hero1.Hero_interface.Hero_Type.StrengthHero;
import com.example.demo_0710.hero1.Hero_interface.Hero_Type.SuperAgilityHero;
import com.example.demo_0710.hero1.Hero_Repository.CacheAgilityHeroRepository;

public final class DemoApplication {
    public static void main(String[] args){
        AgilityHero slark = new AgilityHero("Slark");
        CrudRepository<AgilityHero> crudRepository = new CacheAgilityHeroRepository(
                new AgilityHero[]{
                        new SuperAgilityHero(slark),
                        new AgilityHero("Night Stalker"),
                        new AgilityHero("Drow Ranger"),
                }
        );
         crudRepository.findByName("Slark");
         crudRepository.findByName("Slark");
         crudRepository.findByName("HDoemd");
        Hero selectedHero  = crudRepository.findByName("Slark");

        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();
    }
}