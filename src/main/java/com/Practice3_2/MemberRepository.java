package com.Practice3_2;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository extends MemberAbstractRepository{
    @Override
    public List<Member> rAll(){
        return new ArrayList<>(super.getDatabase().values());
    }

}
