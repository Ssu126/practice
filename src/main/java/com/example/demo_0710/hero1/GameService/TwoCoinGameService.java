package com.example.demo_0710.hero1.GameService;

import com.example.demo_0710.hero1.Hero_interface.Hero;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwoCoinGameService implements IGameService{
    private final Hero hero;

    @Override
    public void play(){
        System.out.println("시작");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("계속?");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("끝");
    }
}
