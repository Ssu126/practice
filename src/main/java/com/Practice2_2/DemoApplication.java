package com.Practice2_2;

public class DemoApplication {
    public final static void main(String[] args){
        IRepository mReponsitory = new MemberReponsitory();

        mReponsitory.create(new Member(1, "susu", 20, "susu@email.com"));
        System.out.println(mReponsitory.read(1));
        mReponsitory.update(new Member(1, "susu1", 21, "susu1@email.com"));
        mReponsitory.delete(1);

        System.out.println(mReponsitory.rAll());
    }
}
