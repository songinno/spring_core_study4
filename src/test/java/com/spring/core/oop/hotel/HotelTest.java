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
        // new AnnotationConfigApplicationContext : 특정 스프링의 설정을 불러 등록된 객체들이 주입받을 수 있게 해주는 객체.
        //HotelFactory.class 커피통
        Hotel hotel = ct.getBean(Hotel.class);
        //Bean: 커피콩. -> 자바 객체. ( 커피콩들로 자바커피를 만드는 것), 호텔 콩만 꺼냄.
        System.out.println("\n=================================================");
        hotel.reserve();
        // 호텔 콩만 꺼냈는데 프렌치레스토랑이랑, 김셰프까지나옴 -> 자동주입 (구현체가 1개씩밖에 없어서 갖다 박음)
        //그럼 2개일때는? -> 코리안 레스토랑 추가 + @Component -> 선택지가 2개. 테스트 실패함.

        /*
        *에러로그 읽는법
        * 들여쓰기 안된 부분 읽으면 됨.
        * Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        *   No qualifying bean of type 'com.spring.core.oop.hotel.Restaurant'
        *   available: expected single matching bean
        *   but found 2: frenchRestaurant,koreanRestaurant
        *
        * Error creating bean with name 'hotel'
        *   defined in file [D:\isec_aaa\core\build\classes\java\main\com\spring\core\oop\hotel\Hotel.class]:
        *   Unsatisfied dependency expressed through constructor parameter 0;
        *   nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        *   No qualifying bean of type 'com.spring.core.oop.hotel.Restaurant' available:
        *   expected single matching bean but found 2: frenchRestaurant,koreanRestaurant
        *   org.springframework.beans.factory.UnsatisfiedDependencyException:
        *   Error creating bean with name 'hotel' defined in file
         */








    }
}