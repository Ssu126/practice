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

        String[] string_array = new String[]{"1", "2", "3"};
        System.out.println(string_array.length);
        Integer[] integer_array = new Integer[]{1, 2, 3};
        System.out.println(integer_array.length);

        System.out.println(string_array);
        System.out.println(integer_array);
    }
}