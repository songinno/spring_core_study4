package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("wlm")
public class WirelessMouse implements Mouse{
    @Override
    public void info() {
        System.out.println("무선 마우스입니다.");
    }
}
