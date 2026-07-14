package com.example.demo;

import com.example.demo1.AgilityHero;
import com.example.demo1.IntelligenceHero;
import com.example.demo1.StrengthHero;
import com.example.demo1.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        Hero strength = new StrengthHero();
        Hero agility = new AgilityHero();
        Hero intelligence = new IntelligenceHero();

        System.out.println("- 🟥 힘 속성 영웅");
        strength.attack();
        strength.ultimate();

        System.out.println("- 🟩 민첩 속성 영웅");
        agility.attack();
        agility.ultimate();

        System.out.println("- 🟦 지능 속성 영웅");
        intelligence.attack();
        intelligence.ultimate();

        Set<String> string_set = new HashSet<>(Arrays.asList("1", "2", "3"));
        string_set.add("4");
        string_set.remove("1");
        string_set.contains("1");
        string_set.clear();
        string_set.isEmpty();
        string_set.size();

        Set<Integer> integer_set = new HashSet<>(Arrays.asList(1, 2, 3));
        integer_set.add(4);
        integer_set.remove(3);
        integer_set.contains(1);
        //integer_set.clear();
        integer_set.isEmpty();
        integer_set.size();

        System.out.println(string_set);
        System.out.println(integer_set);
    }
}