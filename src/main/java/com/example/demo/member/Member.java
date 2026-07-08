package com.example.demo.member;

import com.example.demo.dto.MemberCreateRequestDto;

public class Member {
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    private Member(Integer id, String name, int age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static Member from(MemberCreateRequestDto requestDto){
        return new Member(
                null,
                requestDto.getName(),
                0,
                requestDto.getEmail()
        );
    }

    public String toString(){
        return String.format("Member(id=%s, name=%s, " +
                "age=%s, email=%s", id, name, age, email);
    }

    public String getName(){
        return this.name;
    }
}