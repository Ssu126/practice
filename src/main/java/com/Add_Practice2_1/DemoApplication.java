package com.Add_Practice2_1;

import java.util.List;
import java.util.stream.Collectors;

public class DemoApplication {
    public final static void main(String[] args) {
        IRepository<Member, Integer> mRepository = new MemberRepository();

        System.out.println("--mCreate--");
        Member m1 = mRepository.create(new Member("susu1", 10, "susu1@email.com"));
        Member m2 = mRepository.create(new Member("susu2", 20, "susu2@email.com"));
        Member m3 = mRepository.create(new Member("susu3", 30, "susu3@email.com"));

        System.out.println("\n--mDTO--");
        List<Member> mList = mRepository.read();
        List<MemberResponseDTO> mDTO = mList.stream()
                        .map(m -> new MemberResponseDTO(m.getId(), m.getName(), m.getAge(), m.getEmail()))
                        .collect(Collectors.toList());
        System.out.println("memberDTO : " + mDTO);

        System.out.println("\n--delete--");
        mRepository.delete(3);

        System.out.println("\n--update--");
        mRepository.update(2, new Member("susu22", 22, "susu22@email.com"));

        System.out.println("\n각 개별 조회");
        System.out.println("1번 회원 : " + mRepository.read(1));
        System.out.println("2번 회원 : " + mRepository.read(2));

        IRepository<Vendor, Integer> vRepository = new VendorRepository();
        System.out.println("\n--vCreate--");
        Vendor v1 = vRepository.create(new Vendor("susu4", 40, "susu4@email.com", "서울", "식품4"));
        Vendor v2 = vRepository.create(new Vendor("susu5", 50, "susu5@email.com", "경기도", "식품5"));
        Vendor v3 = vRepository.create(new Vendor("susu6", 60, "susu6@email.com", "대전", "식품5"));

        System.out.println("--vDTO--");
        List<Vendor> vList = vRepository.read();
        List<VendorResponseDTO> vDTO = vList.stream()
                .map(v -> new VendorResponseDTO(v.getId(), v.getName(), v.getAge(), v.getEmail(), v.getAddress(), v.getCategory()))
                .collect(Collectors.toList());
        System.out.println("vendorDTO : " + vDTO);
    }
}