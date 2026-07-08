package com.example.demo.member;

import com.example.demo.dto.MemberCreateRequestDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

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