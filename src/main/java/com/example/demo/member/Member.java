package com.example.demo.member;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class Member {
    protected Integer id;
    @Builder.Default
    protected String name = "Unnamed";
    protected int age;
    @Builder.Default
    protected String email = "Undefined";
    @Singular
    protected List<String> favorites;

    public String toString(){
        return String.format("Member(id=%s, name=%s, " +
                "age=%s, email=%s, favorites=%s", id, name, age, email, favorites);
    }

    public String getName(){
        return this.name;
    }
}