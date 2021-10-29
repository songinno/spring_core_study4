package com.spring.core.oop.hotel;

import org.springframework.stereotype.Component;

@Component
public class ParkChef implements Chef{
    @Override
    public void cook() {
        System.out.println("박셰프가 요리합니다.");
        System.out.println("한식만");
    }
}
