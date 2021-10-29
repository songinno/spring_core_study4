package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("ssk")
public class SamsungKeyboard  implements Keyboard{
    @Override
    public void info() {
        System.out.println("삼성 키보드입니다.");
    }
}
