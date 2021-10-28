package com.spring.core.oop.member;

import lombok.*;

@Setter
@AllArgsConstructor // 모든 인자를 처리하는 생성자
@NoArgsConstructor //기본생성자
@Getter
@ToString
public class Member {
    //(ctrl shift T) -> MemterTest 만들어짐.

    private Long id; // 회원식별코드
    private String name; // 회원명
    private Grade grade; // 회원등급

    //*자바 빈즈 규약
    //기본생성자, 모든 필드 초기화 생성자
    //getter, setter, toString, hashCode, ... 등을 기본적으로 만들어주는 것.

    //그런데 필드값 2개 추가되면 생성자 고치고, getter setter 또 만들어야하고..
    //필드 이름 바뀌면 또 바뀐곳 다 바꿔야하고...
    // => 라이브러리 Lombok
    //메이븐레퍼지토리가서 롬복 찾음.
    // build.gradle에서 라이브러리 종속성 관리: dependencies 에다가 넣고, 오른쪽에 새로고침코끼리 누르면 다운로드됨.
    //shift 2번 누르고 플러그인-마켓플레이스 lombok 고추같이 생긴거



}//end class
