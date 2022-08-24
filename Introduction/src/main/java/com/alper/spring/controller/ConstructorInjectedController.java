package com.alper.spring.controller;

import com.alper.spring.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    //Constructor Injection DI
    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
