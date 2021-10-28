package com.spring.core.oop.hotel;


import com.spring.core.oop.config.HotelFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    @Test
    void reserveTest() {
//        new Hotel(new FrenchRestaurant(new KimChef()));
        // 호텔 만들려면 레스토랑, 레스토랑있으려면 셰프, ... 이런 관계가 많아지면 복잡해짐. -> 이걸 아까 factory가.
        //이젠 스프링이 해줌. 스프링컨테이너. -> @Component
        ApplicationContext ct = new AnnotationConfigApplicationContext(HotelFactory.class);
        Hotel hotel = ct.getBean(Hotel.class);
        hotel.reserve();
    }
}