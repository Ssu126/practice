package com.example.demo_0710.hero1.Hero_interface;

import lombok.Getter;

public abstract class BasicHero implements Hero{
    private final String name;

    public BasicHero(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
