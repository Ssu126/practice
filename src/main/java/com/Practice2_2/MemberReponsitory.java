package com.Practice2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberReponsitory implements IRepository{
    private final Map<Integer, Member> database = new HashMap<>();

    @Override
    public void create(Member member){
        if(database.containsKey(member.getId()))
            throw new RuntimeException("이미 존재하는 ID : " + member.getId());
        database.put(member.getId(), member);
        System.out.println("회원 가입 생성 : " + member.getId());
    }

    @Override
    public Member read(Integer id){
        if(!database.containsKey(id))
            throw new RuntimeException("존재하지 않는 ID : " + id);
        return database.get(id);
    }

    @Override
    public void update(Member member){
        if(!database.containsKey(member.getId()))
            throw new RuntimeException("존재하지 않는 ID : " + member.getId());
        database.put(member.getId(), member);
        System.out.println("회원 정보 수정 완료 : " + member.getName());
    }

    @Override
    public void delete(Integer id){
        if(!database.containsKey(id))
            throw new RuntimeException("존재하지 않는 ID : " + id);
        database.remove(id);
        System.out.println("회원 탈퇴 완료 : " + id);
    }

    @Override
    public List<Member> rAll(){
        return new ArrayList<>(database.values());
    }
}
