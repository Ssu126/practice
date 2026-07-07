package com.example.demo.member;

import lombok.Builder;

@Builder
public class Member {
    protected Integer id;
    @Builder.Default
    protected String name = "Unnamed";
    protected int age;
    @Builder.Default
    protected String email = "Undefined";

    public String toString(){
        return String.format("Member(id=%s, name=%s, " +
                "age=%s, email=%s", id, name, age, email);
    }

    public String getName(){
        return this.name;
    }
}