package com.example.demo2;

import com.example.demo2.hero.common.Hero;
import com.example.demo2.hero.common.IGameService;
import com.example.demo2.hero.StrengthHero;

public final class DemoApplication {
    public static void main(String[] args){
        Hero selectedHero = new StrengthHero();
        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();
    }
}
