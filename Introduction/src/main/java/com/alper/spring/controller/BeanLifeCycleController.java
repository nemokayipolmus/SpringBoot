package com.alper.spring.controller;

import com.alper.spring.service.BeanLifeCycleService;
import org.springframework.stereotype.Controller;

@Controller
public class BeanLifeCycleController {

    private final BeanLifeCycleService beanLifeCycleService;

    public BeanLifeCycleController(BeanLifeCycleService beanLifeCycleService) {
        this.beanLifeCycleService = beanLifeCycleService;
    }

    public void getPostConstruct() {
        beanLifeCycleService.postConstruct();
    }

    public void getPreDestroy() {
        beanLifeCycleService.preDestroy();
    }
}
