package com.Add_Practice1_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository implements IRepository {
    private final Map<Integer, Member> database = new HashMap<>();
    private int idCount = 0;

    @Override
    public Member create(Member entity){
        if(database.containsKey(entity.getId())){
            throw new RuntimeException("존재하는 id : " + entity.getId());
        }
        database.put(entity.getId(), entity);
        idCount++;
        return entity;
    }

    @Override
    public Member read(Integer id){
        if(!database.containsKey(id)){
            throw new RuntimeException("존재하지 않는 id : " + id);
        }
        return database.get(id);
    }

    @Override
    public Member update(Member entity){
        if(!database.containsKey(entity.getId())){
            throw new RuntimeException("존재하지 않는 id : " + entity.getId());
        }
        database.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public void delete(Integer id){
        if(!database.containsKey(id)){
            throw new RuntimeException("존재하지 않는 id : " + id);
        }
        database.remove(id);
        idCount--;
    }

    public Integer idGenerator(){
        return this.idCount;
    }

    public List<Member> rAll(){
        return new ArrayList<>(database.values());
    }

}