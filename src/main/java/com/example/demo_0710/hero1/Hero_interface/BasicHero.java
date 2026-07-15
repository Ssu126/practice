package com.example.demo_0710.hero1.Hero_interface;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
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
