package com.spring.core.oop.order;

import com.spring.core.oop.config.Factory;
import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderControllerTest {

    @Test
    void ocTest() {
        Factory factory = new Factory();
        MemberController mc = factory.memberController();
        OrderController oc = factory.orderController();

        //회원가입
        mc.join(new Member(1L, "김철수", Grade.VIP));

        //주문생성
        oc.createOrder(1L);
        System.out.println("===================================");
    }


}