package com.example.gamePractice.member.P3;

//import lombok.AllArgsConstructor;
//@AllArgsConstructor

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Game {
    private String[] name;
    private int count;

    public void setName(String[] name){
        this.name = name;
    }
    public void setCount(int count){
        this.count = count;
    }

    public String[] play(){
        System.out.println("---플레이어들---");
        for (String each : this.name){
            System.out.println(each);
        }
        System.out.println(this.count);
        System.out.println("---게임 끝---");
        return new String[]{"Aaron", "2시 10분 10초", "아이템 사용 총 10건"};
    }
}
