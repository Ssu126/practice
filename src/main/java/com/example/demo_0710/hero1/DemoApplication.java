package com.example.demo_0710.hero1;

import com.example.demo_0710.hero1.Hero_interface.Hero_Type.StrengthHero;
import com.example.demo_0710.hero1.Player;
import com.example.demo_0710.hero1.Hero_interface.Hero_Type.AgilityHero;
import com.example.demo_0710.hero1.Hero_Repository.CrudRepository;
import com.example.demo_0710.hero1.Hero_interface.Hero;
import com.example.demo_0710.hero1.GameService.IGameService;
import com.example.demo_0710.hero1.GameService.TwoCoinGameService;
import com.example.demo_0710.hero1.Hero_interface.Hero_Type.SuperAgilityHero;
import com.example.demo_0710.hero1.Hero_Repository.CacheAgilityHeroRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
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
    private static final Map<Integer, Player> PLAYERS = new HashMap<>(){
        {
        put(1, new Player(1, "Aaron", Side.RADIANT, 7, 12, 2, new AgilityHero("Slark")));
        put(2, new Player(2, "Baron", Side.RADIANT, 2, 1, 6, new StrengthHero("Slardar")));
        put(3, new Player(3, "Caron", Side.RADIANT, 4, 4, 4, new AgilityHero("Weaver")));
        put(4, new Player(4, "Daron", Side.RADIANT, 8, 4, 4, new StrengthHero("Huskar")));
        put(5, new Player(5, "Earon", Side.RADIANT, 1, 4, 4, new AgilityHero("Anti-Mage")));

        put(6, new Player(6, "Faron", Side.DIRE, 0, 5, 9, new StrengthHero("Tiny")));
        put(7, new Player(7, "Garon",Side.DIRE, 7, 4, 2, new StrengthHero("Dragon Knight")));
        put(8, new Player(8, "Haron", Side.DIRE, 4, 3, 1, new AgilityHero("Night Stalker")));
        put(9, new Player(9, "Iaron", Side.DIRE, 8, 2, 2, new AgilityHero("")));
        put(10, new Player(10, "Jaron", Side.DIRE, 1, 8, 7, new AgilityHero("Draw Rnger")));
        }
    };
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>(PLAYERS.values());

        System.out.println(" -- Stream.forEach -- ");
        Stream<Player> playerStream = playerList.stream();

        Stream<Player> intermediate = playerList.stream()
                .filter(new Predicate<Player>() {
                    @Override
                    public boolean test(Player player) {
                        System.out.println(" >> 첫 번째 중간 연산자가 실행됩니다 << ");
                        return player.getSide().equals(Side.RADIANT);
                    }
                })
                .filter(new Predicate<Player>() {
                    @Override
                    public boolean test(Player player) {
                        System.out.println(" >> 두번째 중간 연산자가 실행됩니다 << ");
                        return player.getKill() >= 5;
                    }
                });
        System.out.println(" -- 중간 연산자들을 적용 완료 / 이제 최종 연산자를 통해 실행 -- ");
        intermediate
                .forEach(new Consumer<Player>() {
                    @Override
                    public void accept(Player player) {
                        System.out.println(player);
                    }
                });
    }
}