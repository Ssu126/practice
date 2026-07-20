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
        StrengthHeroRepository strRepository = new StrengthHeroRepository();
        AgilityHeroRepository aglReponsitory = new AgilityHeroRepository();

        Hero strHero = strRepository.findById(1);
        Hero aglHero = aglReponsitory.findById(2);

        Map<Integer, Hero> heroMap = new HashMap<>();
        heroMap.put(1, strHero);
        heroMap.put(2, aglHero);

        System.out.println("-- Map<String, Hero> hero_map --");
        System.out.println("힘 속성 영웅");
        heroMap.get(1).attack();
        heroMap.get(1).ultimate();

        System.out.println("민첩 속성 영웅");
        heroMap.get(2).attack();
        heroMap.get(2).ultimate();


    }
}
