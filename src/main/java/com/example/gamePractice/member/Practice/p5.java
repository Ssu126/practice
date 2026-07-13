package com.example.gamePractice.member.Practice;

public class p5 {
    public static void main(String[] args){
        //Game game = new Game(new String[]{"Aaron", "Baron"}, 3);
        //Game nullGame = new Game();
        //nullGame.setName(new String[] {"Aaron", "Baron"});
        //nullGame.setCount(3);

        Game game = new Game(new String[]{"Aaron, Baron"});
        game.setCount(3);

        String[] result = game.play();
        System.out.println("결과 출력");
        System.out.println(result);
    }
}
