package com.example.demo_0710.hero.common;

import lombok.Getter;

public class AgilityHero implements Hero{
    @Getter
    private String name;

    public AgilityHero(String name){
        this.name = name;
    }

    public void attack(){
        System.out.println("Fast Attack");
    }
    public void ultimate(){
        System.out.println("Fastest Attack");
    }
}
