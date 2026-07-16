package com.Practice1_1;

public interface IRepository {
    default void create(Member member){
        throw new RuntimeException("create 메서드는 아직 구현되지 않았습니다.");
    };
    default Member read(String id){
        throw new RuntimeException("read 메서드는 아직 구현되지 않았습니다.");
    };
    default void update(Member member){
        throw new RuntimeException("update 메서드는 아직 구현되지 않았습니다.");
    };
    default void delete(String id){
        throw new RuntimeException("delete 메서드는 아직 구현되지 않았습니다.");
    };
}
