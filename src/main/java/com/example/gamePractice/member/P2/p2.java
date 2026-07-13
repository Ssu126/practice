package com.example.gamePractice.member.P2;

public class p2 {
    public static void main(String[] args){
        Game game = new Game(new String[]{"Aaron", "Baron"}, 3);
        String[] result = game.play();
        System.out.println("---결과출력---");
        System.out.println(result);
    }
}
