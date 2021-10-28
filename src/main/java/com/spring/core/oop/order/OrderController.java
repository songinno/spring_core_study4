package com.spring.core.oop.order;

import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;

//1
//책임: 적당한 회원저장소에서 회원정보를 조회한 후, 주문 정보를 생성해야 한다.
public class OrderController {

    private MemberRepository memberRepository;

    public OrderController(MemberRepository memberRepository) {
//        memberRepository = new MemoryMemberRepository();
        //해결
        this.memberRepository = memberRepository;
    }

    //주문정보 생성
    public Order createOrder(Long id) {
        Member member = memberRepository.findById(id);
        return new Order(id, "상품1", 5000);
    }
    //member컨트롤러와, order컨트롤러 둘다 memberRepository에 명령
    //DB로 정책 바꾸면, 이것들이 많으면 다 고쳐야함. 다형성으로 해결 불가.
    // -> 컨트롤러가 관여하면 안됨.
    /*
    public OrderController() {
        memberRepository = new MemoryMemberRepository(); -> new DataBaseMemberRepository();
    }

    public MemberController() {
        memberRepository = new DataBaseMemberRepository();
    }


     */






}
