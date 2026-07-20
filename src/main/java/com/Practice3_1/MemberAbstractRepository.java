package com.Practice3_1;

import com.Practice3_1.Member;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MemberAbstractRepository implements IRepository{
    @Getter
    private final Map<Integer, Member> database = new HashMap<>();
    @Override
    public void create(Member member) {
        if (database.containsKey(member.getId())) {
            throw new RuntimeException("이미 존재하는 ID : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println("회원 등록: " + member.getName());
    }

    @Override
    public Member read(Integer id) {
        if(!database.containsKey(id)) {
            throw new RuntimeException("이미 존재하는 ID : " + id);
        }
        return database.get(id);
    }

    @Override
    public void update(Member member){
        if(!database.containsKey(member.getId())){
            throw new RuntimeException("존재하지 않는 ID : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println();
    }

    @Override
    public void delete(Integer id){
        if(!database.containsKey(id)) {
            throw new RuntimeException("존재하지 않는 ID : " + id);
        }
        database.remove(id);
        System.out.println("회원 삭제 완료 : " + id);
    }

    @Override
    public abstract List<Member> rAll();
}
