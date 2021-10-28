package com.spring.core.oop.member;

//인터페이스는 역할을 지정하는 곳.
//역할: 회원 저장소 역할 - 회원의 정보를 저장하고 조회할 수 있다.
public interface MemberRepository {

    //회원 저장 기능
    boolean save(Member member);
    //회원 조회 기능
    Member findById(Long id);
}
