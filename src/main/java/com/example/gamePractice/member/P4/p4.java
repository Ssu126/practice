package com.example.gamePractice.member.P4;

import com.example.gamePractice.member.P4.Member;

public final class p4 {
    public static void main(String[] args){
        Member aaron = new Member(
                "911028-0000000",
                "Aaron",
                1
        );
        aaron.setName("Baron");
        System.out.println(aaron.toString());

        Member caron = new Member(
                "101010-0000000"
        );
        caron.setName("Caron");
        caron.setAge(2);
    }
}
