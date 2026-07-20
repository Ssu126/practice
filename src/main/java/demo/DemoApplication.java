package demo;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class DemoApplication {
    public static void main(String[] args){
        Hero strength = new StrengthHero();
        Hero agility = new AgilityHero();

        Map<Integer, Hero> heroMap = new HashMap<>();
        heroMap.put(1, strength);
        heroMap.put(2, agility);
        //heroMap.put(3, intelligence);

        System.out.println("힘 속성 영웅");
        heroMap.get(1).attack();
        heroMap.get(1).ultimate();

        System.out.println("민첩 속성 영웅");
        heroMap.get(2).attack();
        heroMap.get(2).ultimate();
    }
}
