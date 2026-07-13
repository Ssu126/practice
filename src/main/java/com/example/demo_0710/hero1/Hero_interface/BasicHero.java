package com.example.demo_0710.hero1.Hero_interface;

import lombok.Getter;

public abstract class BasicHero implements Hero{
    @Getter
    private String name;
    private String attack_type;

    public BasicHero(String name, String attack_type){
        this.name = name;
        this.attack_type = attack_type;
    }

    @Override
    public void attack(){System.out.println("추상클래스에서 작성한 " + attack_type + " attack1");}
    @Override
    public abstract void ultimate();
}
