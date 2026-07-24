package com.Add_Practice1_1;

public class Human {
    protected Integer id;
    protected String name;
    protected boolean isDeleted;

    public Integer getId(){return this.id;}
    public void setId(Integer id){this.id = id;}

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public boolean getDeleted(){return isDeleted;}
    public void setDeleted(boolean isDeleted){this.isDeleted=isDeleted;}
}
