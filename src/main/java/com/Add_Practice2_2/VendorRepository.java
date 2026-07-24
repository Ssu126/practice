package com.Add_Practice2_2;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class VendorRepository extends AbstractRepository<Vendor, Integer>{
    @Override
    public Vendor create(Vendor entity){
        Integer newId = idGenerator();
        entity.setId(newId);
        database.put(newId, entity);

        current();
        return entity;
    }
    @Override
    public Vendor read(Integer id){
        Vendor nVendor = Optional.ofNullable(database.get(id))
                .filter(v -> !v.getIsDeleted())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 ID : " + id));
        current();
        return nVendor;
    }
    @Override
    public List<Vendor> read(){
        List<Vendor> nVendor = database.values().stream()
                .filter(v -> !v.getIsDeleted())
                .collect(Collectors.toList());
        current();
        return nVendor;
    }
    @Override
    public Vendor update(Integer id, Vendor entity){
        Vendor eVember = this.read(id);
        entity.setId(id);
        database.put(id, entity);
        current();
        return entity;
    }
    @Override
    public void delete(Integer id){
        Vendor nVender = this.read(id);
        database.get(id).setIsDeleted(true);
    }
}
