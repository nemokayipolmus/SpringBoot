package com.alper.spring.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello(){
        System.out.println("Hello World");
        return "Hi everyone!";
    }

}
