package com.Practice1_2;

public interface IRepository {
    default void create(Member member){
        throw new RuntimeException("default: 회원 정보 가입 실패");
    }
    default Member read(String id){
        throw new RuntimeException("default: 회원 정보 읽기 실패");
    }
    default void update(Member member){
        throw new RuntimeException("default: 회원 정보 수정 실패");
    }
    default void delete(String id){
        throw new RuntimeException("default: 회월 정보 삭제 실패");
    }
}
