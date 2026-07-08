package com.example.demo2;

import com.example.demo2.hero.common.Hero;
import lombok.RequiredArgsConstructor;

import com.example.demo2.hero.common.IGameService;

@RequiredArgsConstructor
public class TwoCoinGameService implements IGameService{
    private final Hero hero;

    @Override
    public void play(){
        System.out.println(" --- Game Start --- ");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println(" --- Game Continue? --- ");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println(" --- Game End --- ");
    }
}
