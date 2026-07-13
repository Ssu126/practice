package com.example.demo_0710.hero1.Hero_interface.Hero_Type;

import com.example.demo_0710.hero1.Hero_interface.Hero;
import com.example.demo_0710.hero1.Hero_interface.BasicHero;

public class AgilityHero extends BasicHero {
    public AgilityHero(String name){
        super(name);
    }
    @Override
    public void attack(){
        System.out.println("Fast Attack");
    }
    @Override
    public void ultimate(){
        System.out.println("Evasion");
    }
}
