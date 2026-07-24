package com.Add_Practice2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<T extends Human, ID> implements IRepository<T, ID>{
    protected Map<ID, T> database = new HashMap<>();
    private Integer idCount = 0;

    public Integer idGenerator(){
        return ++idCount;
    }
    public List<T> current(){
        System.out.println("--current조회--");
        return new ArrayList<>(database.values());
    }

    public abstract T create(T entity);
    public abstract T read(ID id);
    public abstract List<T> read();
    public abstract T update (ID id, T entity);
    public abstract void delete(ID id);
}
