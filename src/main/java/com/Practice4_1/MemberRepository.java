package com.Practice4_1;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository extends MemberAbstractRepository<Member, Integer>{
    @Override
    public void create(Member member){
        if(database.containsKey(member.getId())){
            throw new RuntimeException("이미 존재하는 id : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println("회원 정보 등록 : " + member.getId());
    }

    @Override
    public void update(Member member){
        if(!database.containsKey(member.getId())){
            throw new RuntimeException("존재하지 않는 id : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println("회원 정보 수정 : " + member.getId());
    }

    @Override
    public List<Member> rAll(){
        return new ArrayList<>(this.database.values());
    }
}