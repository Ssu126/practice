package com.example.demo.member;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {
    private volatile static Member instance;
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public static Member getInstance(){
        synchronized (Member.class){
        if (Objects.isNull(instance)) {
            instance = new Member();
            }
        }
        return instance;
    }
}