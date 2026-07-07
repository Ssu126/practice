package com.example.demo.member;

public class Member {
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public Member(MemberRequestDto dto){
        this.name = dto.getName();
        this.email = dto.getEmail();
    }

    public String toString(){
        return String.format("Member(id=%s, name=%s, " +
                "age=%s, email=%s", id, name, age, email);
    }

    public String getName(){
        return this.name;
    }
}