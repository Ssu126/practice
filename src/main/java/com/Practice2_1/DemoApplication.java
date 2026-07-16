package com.Practice2_1;

import java.util.List;

public class DemoApplication {
    public final static void main(String[] args){
        IRepository mRepository = new MemberRepository();

        System.out.println("1번: crate");
        mRepository.create(new Member(1, "susu", 20, "susu@example.com"));

        System.out.println("2번: read");
        System.out.println(mRepository.read(1));

        System.out.println("3번: update");
        mRepository.update(new Member(1, "susu1", 21, "susu1@example.com"));

        System.out.println("4번: delete");
        //mRepository.delete(1);

        System.out.println(mRepository.rAll());
    }
}
