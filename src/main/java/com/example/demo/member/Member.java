package com.example.demo.member;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {
    private static class LazyHolder {
        private static final Member UNIQUE_INSTANCE = new Member();
    }

    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public static Member getInstance(){
        return LazyHolder.UNIQUE_INSTANCE;
    }
}