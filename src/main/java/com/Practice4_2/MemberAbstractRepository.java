package com.Practice4_2;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MemberAbstractRepository<T, ID> implements IRepository<T, ID>{
    @Getter(AccessLevel.PROTECTED)
    final Map<ID, T> database = new HashMap<>();

    @Override
    public T read(ID id){
        if(!database.containsKey(id)){
            throw new RuntimeException("존재하지 않는 id : " + id);
        }
        return database.get(id);
    }

    @Override
    public void delete(ID id){
        if(!database.containsKey(id)){
            throw new RuntimeException("존재하지 않는 id : " + id);
        }
        database.remove(id);
        System.out.println("아이디 삭제 완료 : " + id);
    }
}
