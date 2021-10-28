package com.spring.core.oop.config;
//3
import com.spring.core.oop.member.DataBaseMemberRepository;
import com.spring.core.oop.member.MemberController;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;
import com.spring.core.oop.order.OrderController;

//역할: 객체를 생성해서 필요한 곳에 넣어주는 역할
public class Factory {

    //회원저장소 객체를 만드는 기능
    public MemberRepository memberRepository() {
//        return new DataBaseMemberRepository(); // 이제 여기만 바꿔주면 됨.
        return new MemoryMemberRepository();
    }

    //회원 컨트롤러 객체를 만드는 기능
    public MemberController memberController() {
        return new MemberController(memberRepository());
        //
    }

    //주문 컨트롤러 객체를 만드는 기능
    public OrderController orderController() {
        return new OrderController(memberRepository());
    }

    /*
    *의존성 주입*

    MC는 MR한테 의존하고있음 = 필드로 두고있음.
    외부에서 받아서 쓰고 있음. 의존 객체를 밖에서 주입받는것. DI.

     */







}//end c
