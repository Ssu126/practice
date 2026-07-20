package demo.ex1;

import demo.ex1.common.Hero;

public class StrengthHero extends Hero {
    public StrengthHero(String name){
        super(name);
    }
    @Override
    public void attack(){
        System.out.println("Str1");
    }

    @Override
    public void ultimate(){
        System.out.println("Str2");
    }
}
