package com.spring.core.oop.hotel;
//1 스프링 시작


import org.springframework.stereotype.Component;

@Component // 이 클래스를 스프링컨테이너에 등록: 스프링에게 객체생성 제어권을 넘김
public class Hotel {

    private final Restaurant restaurant; // 프로그램 실행중에 레스토랑 안바뀌게 보통 final걸어줌.

    public Hotel(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    //레스토랑 예약 기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();


    }

}
