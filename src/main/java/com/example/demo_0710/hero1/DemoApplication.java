package com.example.demo_0710.hero1;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.StrengthHero;
import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;
import com.example.demo_0710.hero1.Hero_interface.Hero;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*public final class DemoApplication {
    public static void main(String[] args){
        AgilityHero slark = new AgilityHero("Slark");
        CrudRepository<String, AgilityHero> crudRepository = new CacheAgilityHeroRepository(
                new AgilityHero[]{
                        new SuperAgilityHero(slark),
                        new AgilityHero("Night Stalker"),
                        new AgilityHero("Drow Ranger"),
                }
        );
         crudRepository.findByKey("Slark");
         crudRepository.findByKey("Slark");
         crudRepository.findByKey("HDoemd");
        Hero selectedHero  = crudRepository.findByKey("Slark");

        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();
    }
}*/
public class DemoApplication {
    public static void main(String[] args) {
        Game.HISTORY.stream()
                .flatMap(game -> game.getPlayers().values().stream())
                .sorted(Comparator.comparing(Player::getName)
                        .thenComparing((o1, o2) -> o1.getSide().compareTo(o2.getSide()))
                        .thenComparing((o1, o2) -> o2.getKill() - o1.getKill())
                )
                .forEach(player -> System.out.println(player));
    }
}