package demo;

public class StrengthHero implements Hero{
    @Override
    public void attack(){
        System.out.println("Str1");
    }

    @Override
    public void ultimate(){
        System.out.println("Str2");
    }
}
