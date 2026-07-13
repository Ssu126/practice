package com.example.gamePractice.member.P4;

public class Member {
    private final String citizen;
    private String name;
    private int age;

    public Member(String citizen){
        this.citizen = citizen;
    }
    public Member(String citizen, String name, int age){
        this.citizen = citizen;
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void birthdat(){
        this.age ++;
    }
    public String toString(){
        return "Member(citizen=" + this.citizen + ", name=" + this.name + ")";
    }
}
