package demo.ex1;

import demo.ex1.common.Hero;

public class AgilityHero extends Hero {
    public AgilityHero(String name){
        super(name);
    }
    @Override
    public void attack(){
        System.out.println("Agl1");
    }

    @Override
    public void ultimate(){
        System.out.println("Agl2");
    }
}
