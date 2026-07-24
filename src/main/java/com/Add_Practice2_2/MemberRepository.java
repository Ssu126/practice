package com.Add_Practice2_2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MemberRepository extends AbstractRepository<Member, Integer>{
    @Override
    public Member create(Member entity){
        Integer newId = idGenerator();
        entity.setId(newId);
        database.put(newId, entity);

        current();
        return entity;
    }
    @Override
    public Member read(Integer id){
        Member nMember = Optional.ofNullable(database.get(id))
                .filter(m -> !m.getIsDeleted())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 ID : " + id));
        current();
        return nMember;
    }
    @Override
    public List<Member> read(){
        List<Member> nMember = database.values().stream()
                .filter(m -> !m.getIsDeleted())
                .collect(Collectors.toList());
        current();
        return nMember;
    }
    @Override
    public Member update(Integer id, Member entity){
        Member eMember = this.read(id);
        entity.setId(id);
        database.put(id, entity);

        current();
        return entity;
    }
    @Override
    public void delete(Integer id){
        Member eMember = this.read(id);
        database.get(id).setIsDeleted(true);

        current();
    }
}
