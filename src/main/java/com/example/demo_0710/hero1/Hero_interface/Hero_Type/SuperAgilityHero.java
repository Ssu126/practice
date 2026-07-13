package com.example.demo_0710.hero1.Hero_interface.Hero_Type;

public class SuperAgilityHero extends AgilityHero{
    private final AgilityHero actual;

    public SuperAgilityHero(AgilityHero actual){
        super(actual.getName());
        this.actual = actual;
    }

    @Override
    public void attack(){
        this.actual.attack();
        this.actual.attack();
    }

    @Override
    public void ultimate(){
        this.actual.ultimate();
        this.actual.ultimate();
        this.actual.ultimate();
    }
}
