package com.example.demo_0710.hero;

import com.example.demo_0710.hero.common.*;

public final class DemoApplication {
    public static void main(String[] args){
        HeroRepository heroRepository = new AgilityHeroResponsitory();
        Hero selectedHero = heroRepository.findHeroByName("Slark");
        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();
    }
}
