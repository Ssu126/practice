package com.Add_Practice2_2;

public class Member extends Human{
    private Integer age;
    private String email;

    public Member(String name, Integer age, String email){
        super(name);
        this.age=age;
        this.email=email;
    }
}
