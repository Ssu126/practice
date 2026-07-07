package com.example.demo.member;

public class Member {
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public Member(Integer id, String name, int age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String toString(){
        return String.format("Member(id=%s, name=%s, " +
                "age=%s, email=%s", id, name, age, email);
    }

    public String getName(){
        return this.name;
    }
}