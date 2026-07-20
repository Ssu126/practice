package demo;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        System.out.println("-- Map<Integer, Hero> heroMap --");
        System.out.println("힘 속성 영웅");
        heroMap.get(1).attack();
        heroMap.get(1).ultimate();

        System.out.println("민첩 속성 영웅");
        heroMap.get(2).attack();
        heroMap.get(2).ultimate();

        List<Hero> heroList = new ArrayList<>();
        heroList.add(strength);
        heroList.add(agility);

        System.out.println("-- List<Hero> heroList --");
        System.out.println("힘 속성 영웅");
        heroList.get(0).attack();
        heroList.get(0).ultimate();

        System.out.println("민첩 속성 영웅");
        heroList.get(1).attack();
        heroList.get(1).ultimate();
    }
}
