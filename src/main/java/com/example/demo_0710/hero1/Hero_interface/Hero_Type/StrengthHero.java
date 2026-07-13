package com.example.demo_0710.hero1.Hero_interface.Hero_Type;

import com.example.demo_0710.hero1.Hero_interface.BasicHero;
import com.example.demo_0710.hero1.Hero_interface.Hero;

public class StrengthHero extends BasicHero {
    public StrengthHero(String name){
        super(name);
    }
    @Override
    public void attack(){
        System.out.println("Bash Attack");
    }
    @Override
    public void ultimate(){
        System.out.println("Barserker");
    }
    public void additional(){
        System.out.println("Taunt");
    }
}
