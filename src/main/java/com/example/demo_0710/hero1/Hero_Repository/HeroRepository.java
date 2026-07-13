package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;

public interface HeroRepository {
    Hero findHeroByName(String name);
}
