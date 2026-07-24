package com.Add_Practice1_1;

public class Member extends Human{
    private Integer age;
    private String email;

    public Member(String name, Integer age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
        this.isDeleted = false;
    }

    public Integer getAge(){return age;}
    public void setAge(Integer age){this.age = age;}

    public String getEmail(){return email;}
    public void setEmail(String name){this.email = email;}

    @Override
    public String toString(){
        return String.format("Member(id=%d, name=%s, age=%d, email=%s, 삭제 여부=%b)", getId(), getName(), age, email, getDeleted());
    }
}
