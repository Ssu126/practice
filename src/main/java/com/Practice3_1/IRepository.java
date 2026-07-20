package com.Practice3_1;

import java.util.List;

public interface IRepository {
    List<Member> rAll();

    default void create(Member member){
        throw new RuntimeException("create 메서드는 아직 구현되지 않았습니다.");
    };
    default Member read(Integer id){
        throw new RuntimeException("read 메서드는 아직 구현되지 않았습니다.");
    };
    default void update(Member member){
        throw new RuntimeException("update 메서드는 아직 구현되지 않았습니다.");
    };
    default void delete(Integer id){ throw new RuntimeException("delete 메서드는 아직 구현되지 않았습니다.");
    };
}
