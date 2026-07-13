package com.example.demo_0710.hero1;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;
import com.example.demo_0710.hero1.Hero_Repository.AgilityHeroRepository;
import com.example.demo_0710.hero1.Hero_Repository.CrudRepository;
import com.example.demo_0710.hero1.Hero_interface.Hero;
import com.example.demo_0710.hero1.GameService.IGameService;
import com.example.demo_0710.hero1.GameService.TwoCoinGameService;

public final class DemoApplication {
    public static void main(String[] args){
         CrudRepository<AgilityHero> crudRepository = new AgilityHeroRepository(
                new AgilityHero[]{
                        new AgilityHero("Slark"),
                        new AgilityHero("Night Stalker"),
                        new AgilityHero("Drow Ranger"),
                }
        );
        crudRepository.create(new AgilityHero("Weaver"));
        crudRepository.delete("Slark");
        Hero selectedHero  = crudRepository.findByName("Slark");

        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();
    }
}
