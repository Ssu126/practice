package com.example.gamePractice.member.Practice;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Game {
    private final String[] name;
    private int count;

    public void setCount (int count){
        this.count = count;
    }

    public String[] play(){
        System.out.println("플레이어");
        for(String each : this.name){
            System.out.println(each);
        }
        System.out.println(this.count);
        System.out.println("게임 끝");
        return new String[] {"Aaron", "2시 10분 10초", "아이템 사용 총 10건"};
    }
}
