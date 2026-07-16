package com.Practice2_2;

import java.util.List;

public interface IRepository {
    List<Member> rAll();

    default void create(Member member){
        throw new RuntimeException("default: create 오류");
    };
    default Member read(Integer id){
        throw new RuntimeException("default: read 오류");
    };
    default void update(Member member){
        throw new RuntimeException("default: update 오류");
    };
    default void delete(Integer id){
        throw new RuntimeException("default: delete 오류");
    };
}
