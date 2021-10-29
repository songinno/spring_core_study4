package com.spring.core.oop.computer;


import com.spring.core.oop.config.ComputerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ComputerTest {
    @Test
    void computerTest() {
        ApplicationContext ct = new AnnotationConfigApplicationContext(ComputerFactory.class);
        Computer computer = ct.getBean(Computer.class);
        System.out.println("\n============================");
        computer.showSpec();
        System.out.println("============================\n");
    }

}