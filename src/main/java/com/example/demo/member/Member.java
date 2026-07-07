package com.example.demo.member;

public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String toString(){
        return String.format("Member(id=%s, name=%s, age=%s, email=%s)", id, name, age, email);
    }

    public String getName(){
        return this.name;
    }
}