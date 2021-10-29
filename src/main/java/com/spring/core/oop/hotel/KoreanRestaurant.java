package com.spring.core.oop.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("kr")
public class KoreanRestaurant implements Restaurant{

    private final Chef chef;
    @Autowired
    public KoreanRestaurant(@Qualifier("parkChef") Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("한식 요리를 주문합니다.");
        chef.cook();
    }
}
