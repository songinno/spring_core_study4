package com.spring.core.oop.hotel;
//1 스프링 시작


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // 이 클래스를 스프링컨테이너에 등록: 스프링에게 객체생성 제어권을 넘김
public class Hotel {
    //+[21.10.29] 의존관계 주입 방법
    //+필드주입
//    @Autowired // -> 필요한 의존객체를 자동주입하겠다.
//    @Qualifier("frenchRestaurant") // -> 구체적 구현체를 특정. (파스칼 케이스 -> 카멜 케이스, 에러에서도 카멜케이스로 써져있음.)
    private final Restaurant restaurant; // (프로그램 실행중에 레스토랑 안바뀌게 보통 final걸어줌, 테스트할때는 생성자 주석, final 제거)

    //+생성자주입
    //레스토랑 예약 기능
    @Autowired
    public Hotel(@Qualifier("fr") Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    //그래서 셋중에 뭐쓰냐, 생성자 주입V(이유는 6강 교안 참고). Member 할때 썼던게 생성자주입 방법임. (거기서도 setter랑 필드 주입 다 할 수 있음)
    // 프랑스는 킴쉐프가, 한식은 박쉐프가 주입되게 해보기.


//    //+setter주입 (수정자주입)
//    @Autowired
//    @Qualifier("frenchRestaurant")
//    public void setRestaurant(Restaurant restaurant) {
//        this.restaurant = restaurant;
//    }

    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();


    }

}
