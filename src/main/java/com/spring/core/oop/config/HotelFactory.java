package com.spring.core.oop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//그냥 설정 파일 개념의 클래스. (설계도x)
@Configuration // 스프링 컨테이너 설정파일 등록 (컨테이너: 커피 담는 통)
@ComponentScan(basePackages = "com.spring.core.oop.hotel") // 컨테이너 탐색 범위 설정 (커피콩들(호텔,프렌치레스토랑,김셰프) 모을 범위)
//구체적으로 써줘야 좋음.
public class HotelFactory {
}
