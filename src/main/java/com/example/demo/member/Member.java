package com.example.demo.member;

public class Member {
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public Member(String name){
        this.name = name;
    }
    public void setEmail(String email){
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