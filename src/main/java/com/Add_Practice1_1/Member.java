package com.Add_Practice1_1;

public class Member extends Human{
    private final Integer age;
    private final String email;

    public Member(Integer id, String name, Integer age, String email){
        super(id, name);
        this.age = age;
        this.email = email;
    }

    public Integer getId(){
        return this.id;
    }

    public String toString(){
        return String.format("Member(id=%d, name=%s, age=%d, email=%s)", this.id, this.name, this.age, this.email);
    }
}
