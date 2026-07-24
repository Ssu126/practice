package com.Add_Practice2_1;

public class Vendor extends Human{
    private Integer age;
    private String email;
    private String address;
    private String category;

    public Vendor(String name, Integer age, String email, String address, String category){
        super(name);
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    public Integer getAge(){return age;}
    public String getEmail(){return email;}
    public String getAddress(){return address;}
    public String getCategory(){return category;}

    @Override
    public String toString(){
        return String.format("Vendor(id=%d, name=%s, age=%d, email=%s, address=%s, category=%s, isDeleted=%b",
                getId(), getName(), age, email, address, category, getIsDeleted());
    }
}
