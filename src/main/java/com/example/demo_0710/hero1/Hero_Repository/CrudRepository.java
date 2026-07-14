package com.example.demo_0710.hero1.Hero_Repository;

import com.example.demo_0710.hero1.Hero_interface.Hero;

public interface CrudRepository<K, V>{
    V findByKey(String name);

    default void create(V entity){
        throw new RuntimeException("create 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
    default V update(V entity) {
        throw new RuntimeException("update 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
    default void delete(String name) {
        throw new RuntimeException("delete 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
}
