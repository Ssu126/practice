package com.Practice3_2;

import com.Practice3_2.Member;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MemberAbstractRepository implements IRepository{
    @Getter
    private final Map<Integer, Member> database = new HashMap<>();

    public void create(Member member){
        if(!database.containsKey(member.getId())){
            throw new RuntimeException("중복된 ID : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println("회원 등록 완료 : " + member.getName());
    }

    public Member read(Integer id){
        if(!database.containsKey(id)){
            throw new RuntimeException("존재하지 않는 id : " + id);
        }
        return database.get(id);
    }

    public void update(Member member){
        if(!database.containsKey(member.getId())){
            throw new RuntimeException("존재하지 않는 id : " + member.getId());
        }
        database.put(member.getId(), member);
        System.out.println("회원 정보 수정 : " + member.getId());
    }

    public void delete(Integer id){
        if(!database.containsKey(id)){
            throw new RuntimeException("존재하지 않는 id : " + id);
        }
        database.remove(id);
        System.out.println("아이디 삭제 완료");
    }

    @Override
    public abstract List<Member> rAll();
}
