package com.example.demo1;

public class AgilityHero implements Hero{
    @Override
    public void attack(){
        System.out.println("Agi1");
    }
    @Override
    public void ultimate(){
        System.out.println("Agi2");
    }
}
