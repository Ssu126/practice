package com.example.demo1;

public class IntelligenceHero implements Hero{
    @Override
    public void attack(){
        System.out.println("Int1");
    }
    @Override
    public void ultimate(){
        System.out.println("Int2");
    }
}
