package com.Practice4_2;

import java.util.List;

public interface IRepository<T, ID> {
    default void create(T entity) {
        throw new RuntimeException("default : 생성 실패");
    }
    default T read(ID id) {
        throw new RuntimeException("default: 생성 실패");
    }
    default void update(T entity){
        throw new RuntimeException("default: 수정 실패");
    }
    default void delete(ID id){
        throw new RuntimeException("default: 삭제 실패");
    }

    default List<Member> rAll(){
        throw new RuntimeException("default: 전체 조회 실패");
    };
}
