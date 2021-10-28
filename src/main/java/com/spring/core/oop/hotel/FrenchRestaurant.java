package com.spring.core.oop.hotel;

import org.springframework.stereotype.Component;

//3
@Component
public class FrenchRestaurant implements Restaurant{

    private final Chef chef; // 셰프가 누구든 상관없음. 요리만 할 줄 알면됨. -> interface로.

    public FrenchRestaurant(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("프랑스 요리를 주문합니다.");
        chef.cook();
    }
}
