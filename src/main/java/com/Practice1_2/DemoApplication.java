package com.Practice1_2;

public class DemoApplication {
    public final static void main(String[] args){
        IRepository mRepository = new MemberRepository();

        System.out.println("1번: create");
        mRepository.create(new Member("1", "susu", 20, "susu@example.com"));

        System.out.println("2번: read");
        System.out.println(mRepository.read("1"));

        System.out.println("3번: update");
        mRepository.update(mRepository.read("1"));

        System.out.println("4번: delete");
        mRepository.delete("1");
    }
}
