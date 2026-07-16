package com.Practice1_1;

public class MemberRepository implements IRepository{
    private Member[] members = new Member[0];

    @Override
    public void create(Member member){
        for(Member each : members){
            if(each.getId().equals(member.getId())) {
                throw new RuntimeException("이미 존재하는 id : " + member.getId());
            }
        }
        Member[] nMember = new Member[members.length + 1];
        System.arraycopy(members, 0, nMember, 0, members.length);
        nMember[members.length] = member;

        this.members = nMember;
        System.out.println("회원 등록 : " + member.getName());
    }

    @Override
    public Member read(String id){
        for(Member each : members){
            if(each.getId().equals(id)){
                return each;
            }
        }
        throw new RuntimeException("존재하지 않는 id : " + id);
    }

    @Override
    public void update(Member member){
        for(int i = 0; i < members.length; i++){
            if(members[i].getId().equals(member.getId())){
                members[i] = member;
                System.out.println("회원 수정 : " + member);
                return;
            }
        }
        throw new RuntimeException("회원 존재하지 않음 : " + member);
    }

    @Override
    public void delete(String id){
        int tIndex = -1;
        for(int i =0; i < members.length; i++){
            if(members[i].getId().equals(id)){
                tIndex = i;
                break;
            }
        }
        if(tIndex == -1){
            throw new RuntimeException("회원 존재하지 않음 : " + id);
        }
        Member[] nMember = new Member[members.length - 1];

        System.arraycopy(members, 0, nMember, 0, tIndex);
        System.arraycopy(members, tIndex + 1, nMember, tIndex, members.length - tIndex - 1);

        this.members = nMember;
        System.out.println("회원 삭제 성공: " + id);
    }
}