package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("lgm")
public class LGMonitor implements Monitor{
    @Override
    public void info() {
        System.out.println("lg 모니터입니다.");
    }
}
