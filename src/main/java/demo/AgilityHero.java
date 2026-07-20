package demo;

public class AgilityHero implements Hero {
    @Override
    public void attack(){
        System.out.println("Agl1");
    }

    @Override
    public void ultimate(){
        System.out.println("Agl2");
    }
}
