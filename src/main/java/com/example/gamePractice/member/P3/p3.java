package com.example.gamePractice.member.P3;

public class p3 {
    public static void main(String[] args){
        //Game game = new Game(new String[]{"Aaron", "Baron"}, 3);
        Game nullGame = new Game();
        nullGame.setName(new String[]{"Aaron, Baron"});

        String[] result = nullGame.play();
        System.out.println("---결과출력---");
        System.out.println(result);
    }
}
