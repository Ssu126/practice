package com.Add_Practice1_1;

public interface IRepository {
    Member create(Member entity);
    Member read(Integer id);
    Member update(Member entity);
    void delete(Integer id);
}
