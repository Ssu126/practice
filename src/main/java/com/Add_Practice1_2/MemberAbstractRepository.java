package com.Add_Practice1_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MemberAbstractRepository implements IRepository{
    protected final Map<Integer, Member> database = new HashMap<>();
    private Integer idCount = 0;

    public Integer idGenerator(){
        return ++idCount;
    }

    public List<Member> current(){
        System.out.println("current 조회");
        return new ArrayList<>(database.values());
    }

    public abstract Member create(Member entity);
    public abstract Member read(Integer id);
    public abstract List<Member> read();
    public abstract Member update(Integer id, Member entity);
    public abstract void delete(Integer id);
}
