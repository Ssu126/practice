package com.Add_Practice1_1;

import java.util.List;

public class DemoApplication {
    public final static void main(String[] args){
        MemberRepository mRepository = new MemberRepository();

        System.out.println("--create--");
        Member m1 = mRepository.create(new Member("susu1", 10, "susu1@email.com"));
        Member m2 = mRepository.create(new Member("susu2", 20, "susu2@email.com"));
        Member m3 = mRepository.create(new Member("susu3", 30, "susu3@email.com"));

        System.out.println("\n--read--");
        System.out.println("전체 조회 목록: " + mRepository.read());

        System.out.println("\n--delete--");
        mRepository.delete(3);

        System.out.println("\n--update--");
        mRepository.update(2, new Member("susu22", 22, "susu22@email.com"));


        System.out.println("\n--객체 개별 조회--");
        System.out.println("1번 회원 조회\n" + mRepository.read(1));
        System.out.println("2번 회원 조회\n" + mRepository.read(2));
    }
}
