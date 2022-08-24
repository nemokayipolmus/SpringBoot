package com.alper.spring.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class DataLoad implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Prior data loading obviously\n******************");

    }
}
