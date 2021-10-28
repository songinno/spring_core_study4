package com.spring.core.oop.member;

//책임: 회원의 정보를 '데이터베이스'에 저장하고 조회할 수 있다.
public class DataBaseMemberRepository implements MemberRepository{


    @Override
    public boolean save(Member member) {
        System.out.println("DB에 " + member + " 저장함!");
        return false;
    }

    @Override
    public Member findById(Long id) {
        System.out.println("DB에서 " + id + "번 회원 조회함!");
        return null;
    }
}
