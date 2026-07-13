package com.example.demo_0710.hero1.Hero_interface.Hero_Type;

import com.example.demo_0710.hero1.Hero_interface.BasicHero;
import com.example.demo_0710.hero1.Hero_interface.Hero;

public class StrengthHero extends BasicHero {
    public StrengthHero(String name){
        super(name, "Strong");
    }
    @Override
    public void ultimate(){
        System.out.println("클래스에 작성한 Strong ultimate");
    };
}
