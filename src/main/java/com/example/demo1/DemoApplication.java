package com.example.demo;

import com.example.demo1.AgilityHero;
import com.example.demo1.IntelligenceHero;
import com.example.demo1.StrengthHero;
import com.example.demo1.Hero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String> string_list = Arrays.asList("1", "2", "3");
        string_list.get(3);
        string_list.add("4");
        string_list.set(3, "5");
        string_list.remove(3);
        string_list.subList(0, 1);
        string_list.sort(String::compareTo);
        string_list.contains("1");
        string_list.clear();
        string_list.isEmpty();
        string_list.size();

        List<Integer> integer_list = Arrays.asList(1, 2, 3);
        integer_list.get(3);
        integer_list.add(4);
        integer_list.set(3, 5);
        integer_list.remove(3);
        integer_list.subList(0, 1);
        integer_list.sort(Integer::compareTo);
        integer_list.clear();
        integer_list.isEmpty();
        integer_list.size();
        
        System.out.println(string_list);
        System.out.println(integer_list);
    }
}