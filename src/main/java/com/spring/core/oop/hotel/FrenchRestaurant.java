package com.spring.core.oop.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//3
@Component("fr") // 이렇게 이름 지어줄 수 있음. Hotel @Qualifier에 fr이라고 적으면 됨.
public class FrenchRestaurant implements Restaurant{

    private final Chef chef; // 셰프가 누구든 상관없음. 요리만 할 줄 알면됨. -> interface로.

    @Autowired
    public FrenchRestaurant(@Qualifier("kimChef") Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("프랑스 요리를 주문합니다.");
        chef.cook();
    }
}
