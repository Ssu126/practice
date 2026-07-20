package com.Practice4_2;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository extends MemberAbstractRepository<Member, Integer> {
    @Override
    public void create(Member member){
        if(database.containsKey(member.getId())){
            throw new RuntimeException("아이디 생성 실패 : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println("회원 가입 완료 : " + member.getId());
    }

    @Override
    public void update(Member member){
        if(!database.containsKey(member.getId())){
            throw new RuntimeException("존재하지 않는 아이디 : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println("회원 정보 업데이트 : " + member.getId());
    }

    @Override
    public List<Member> rAll(){
        return new ArrayList<>(this.database.values());
    }
}
