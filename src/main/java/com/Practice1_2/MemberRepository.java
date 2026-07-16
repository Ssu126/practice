package com.Practice1_2;

public class MemberRepository implements IRepository{
    Member[] members = new Member[0];

    @Override
    public void create(Member member){
        for(Member each : members){
            if(each.getId().equals(member.getId())){
                throw new RuntimeException("이미 존재하는 회원: " + member.getId());
            }
        }
        Member[] nMember = new Member[members.length + 1];
        System.arraycopy(members, 0, nMember, 0, members.length);
        nMember[members.length] = member;

        this.members = nMember;
        System.out.println("회원 생성: " + member.getId());
    }

    @Override
    public Member read(String id){
        for(Member each : members){
            if(each.getId().equals(id)){
                return each;
            }
        }
        throw new RuntimeException("존재하지 않는 회원 : " + id);
    }

    @Override
    public void update(Member member){
        for(int i = 0; i < members.length; i++){
            if(members[i].equals(member)){
                members[i] = member;
                System.out.println("회원 정보 수정 : " + member.getName());
                return;
            }
        }
        throw new RuntimeException("존재하지 않는 회원 : " + member.getId());
    }

    @Override
    public void delete(String id) {
        int index = -1;
        for (int i = 0; i < members.length; i++) {
            if (members[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if(index == -1){
            throw new RuntimeException("존재하지 않는 회원 :" + id);
        }
        Member[] nMember = new Member[members.length];
        System.arraycopy(members, 0, nMember, 0, index);
        System.arraycopy(members, index + 1, nMember, index, members.length - index - 1);
        this.members = nMember;
        System.out.println("회원 정보 삭제: " + id);
    }
}

