package com.Add_Practice2_1;

public class Member extends Human {
    private Integer age;
    private String email;

    public Member(String name, Integer age, String email){
        super(name);
        this.age = age;
        this.email = email;
    }

    public Integer getAge(){return this.age;}
    public void setAge(Integer age){this.age = age;}

    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}

    public String toString(){
        return String.format("Member = (id=%d, name=%s, age=%d, email=%s, isDeleted=%b)",
                getId(), getName(), age, email, getIsDeleted());
    }
}
