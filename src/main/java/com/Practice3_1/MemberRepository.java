package com.Practice3_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository extends MemberAbstractRepository{
    @Override
    public List<Member> rAll(){
        return new ArrayList<>(super.getDatabase().values());
    }
}