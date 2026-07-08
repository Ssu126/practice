package com.example.demo.member;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {
    private static Member instance;
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public static Member getInstance(){
        if (Object.isNull(instance)){
            instance = new Member();
        }
        return instance;
    }
}