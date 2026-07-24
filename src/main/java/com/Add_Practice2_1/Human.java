package com.Add_Practice2_1;

public class Human {
    private Integer id;
    private String name;
    protected boolean isDeleted;

    public Human(String name){

        this.name = name;
        isDeleted = false;
    }

    public Integer getId(){return this.id;}
    public void setId(Integer id){this.id=id;}

    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}

    public boolean getIsDeleted(){return this.isDeleted;}
    public void setIsDeleted(boolean isDeleted){this.isDeleted=isDeleted;}
}
