package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("hpm")
public class HPMouse implements Mouse{
    @Override
    public void info() {
        System.out.println("hp 마우습니다.");
    }
}
