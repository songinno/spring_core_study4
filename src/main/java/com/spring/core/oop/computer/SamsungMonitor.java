package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component("ssm")
public class SamsungMonitor implements Monitor{
    @Override
    public void info() {
        System.out.println("삼성 모니터입니다.");
    }
}
