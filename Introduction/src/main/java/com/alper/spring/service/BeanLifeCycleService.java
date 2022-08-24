package com.alper.spring.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
 Firstly a class will be instantiated and properties can be passed so that propery values can be set within the bean.
 There are a number of interfaces that are called and there are some pre and post bean processors, once this has finished the bean is ready to use.
 The destroy method is called to terminate a bean you can also implement a custom destroy method if you desire.

 You have two annotations that you can hook into the lifecycle @PostConstruct and @PreDestroy
 You can also implement two interfaces postProcessBeforeInitialization and postProcessAfterInitialization which will also hook into the bean lifecycle.
 */
@Service
public class BeanLifeCycleService {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean has been constructed");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean being destroyed");
    }
}
