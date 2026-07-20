package com.Practice3_2;

import com.Practice3_2.Member;

import java.util.List;

public interface IRepository {
    List<Member> rAll();

    default void create(Member member){
        throw new RuntimeException("디폴트: 회원 가입 오류");
    };
    default Member read(Integer id){
        throw new RuntimeException("디폴트: 회원 읽기 오류");
    };
    default void update(Member member){
        throw new RuntimeException("디폴트: 회원 정보 수정");
    };
    default void delete(Integer id){
        throw new RuntimeException("디폴트: 회원 정보 삭제");
    };
}
