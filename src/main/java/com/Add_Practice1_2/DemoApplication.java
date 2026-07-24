package com.Add_Practice1_2;

import com.Add_Practice1_2.Member;

public class DemoApplication {
    public final static void main(String[] args) {
        MemberRepository repository = new MemberRepository();

        System.out.println("--create--");
        Member m1 = repository.create(new Member("susu1", 10, "susu1@email.com"));
        Member m2 = repository.create(new Member("susu2", 20, "susu2@email.com"));
        Member m3 = repository.create(new Member("susu3", 30, "susu3@email.com"));

        System.out.println("\n--read--");
        System.out.println("전체 목록 조회: " + repository.read());

        System.out.println("\n--delete--");
        repository.delete(3);

        System.out.println("\n--update--");
        repository.update(2, new Member("susu22", 22, "susu22@email.com"));

        System.out.println("\n각 개별 조회");
        System.out.println("1번 회원 : " + repository.read(1));
        System.out.println("2번 회원 : " + repository.read(2));
    }
}
