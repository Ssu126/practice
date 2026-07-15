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
                                .collect(Collectors.joining(", "));

        System.out.println(" -- Stream.forEach -- ");
        Stream<Player> playerStream = playerList.stream();
        Stream<String> intermediate = playerList.stream()
                .peek(player -> System.out.println(" >> 첫번째 중간 연산자가 실행됩니다 << "))
                .filter(player -> player.getSide().equals(Side.RADIANT))
                .peek(player -> System.out.println(" >> 두번째 중간 연산자가 실행됩니다 << "))
                .filter(player -> player.getKill() >= 5)
                .peek(player -> System.out.println(" >> 세번째 중간 연산자가 실행됩니다 << "))
                .map(Player::getPickedHero)
                .map(Hero::getName);

                System.out.println(" -- 중간 연산자들을 적용 완료 / 이제 최종 연산자를 통해 실행 -- ");
                intermediate
                        .forEach(new Consumer<String>() {
                            @Override
                            public void accept(String heroName) {
                                System.out.println(heroName);
                            }
                        });
    }
}