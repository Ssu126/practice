package com.Add_Practice1_1;

public class DemoApplication {
    public final static void main(String[] args){
        MemberRepository mRepository = new MemberRepository();

        System.out.println("--create--");
        mRepository.create(new Member(1, "susu1", 10, "susu1@email.com"));
        mRepository.create(new Member(2, "susu2", 20, "susu2@email.com"));
        mRepository.create(new Member(3, "susu3", 30, "susu3@email.com"));

        System.out.println("--delete--");
        mRepository.delete(3);

        System.out.println("--update--");
        mRepository.update(new Member(2, "susu22", 22, "susu22@email.com"));

        System.out.println("--read--");
        System.out.println(mRepository.read(1).toString());
        System.out.println(mRepository.read(2).toString());

        System.out.println("--read All--");
        System.out.println(mRepository.rAll());
    }
}
