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
        List<Player> playerList = new ArrayList<>(Game.HISTORY.get(0).getPlayers().values());
        String accumulatedHeroes =
                playerList.stream()
                                .filter(player -> player.getSide().equals(Side.RADIANT))
                                .filter(player -> player.getKill() >= 5)
                                .map(Player::getPickedHero)
                                .sorted(new Comparator<Hero>() {
                                    @Override
                                    public int compare(Hero o1, Hero o2) {
                                        return o1.getName().compareTo(o2.getName());
                                    }
                                })
                                .map(Hero::getName)
                                //.collect(Collectors.joining(", "));
                                .reduce(
                                    "래디언트에서 5킬 이상을 달성한 영웅들은 : ",
                                    (accumulated, heroName) -> accumulated + ", " + heroName
                                );
        System.out.println(accumulatedHeroes);
    }
}