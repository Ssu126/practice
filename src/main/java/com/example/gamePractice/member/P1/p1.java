package com.example.gamePractice.member.P1;

public class p1 {
    public static String[] play(String[]name, int count){
        System.out.println("--- 플레이어들 ---");
        for (String each : name){
            System.out.println(each);
        }
        System.out.println("--- 게임 끝 ---");
        return new String[]{"Aaron", "2시 10분 10초", "아이템 사용 총 10건"};
    }

    public static void main(String[] args){
        //자동차 닉네임들을 받고
        String[] name;
        int count;

        name = new String[]{"Aaron", "Baron"};
        count = 3;

        String[] result = play(name, count);
        System.out.println("--- 결과출력 ---");
        System.out.println(result);

    }
}
