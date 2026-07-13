package com.example.gamePractice.member.P2;

public class Game {
    String[] name;
    int count;

    public Game(String[] name, int count){
        this.name = name;
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
