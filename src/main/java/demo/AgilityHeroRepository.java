package demo;

import java.util.Map;

public class AgilityHeroRepository implements HeroRepository<AgilityHero, Integer>{
    public static Map<Integer, AgilityHero> repository = Map.of(2, new AgilityHero());

    public AgilityHero findById(Integer id){
        return repository.get(id);
    }

}
