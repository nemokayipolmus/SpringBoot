package com.alper.spring;

import com.alper.spring.component.DataLoad;
import com.alper.spring.component.OwnPropertyValues;
import com.alper.spring.controller.BeanLifeCycleController;
import com.alper.spring.controller.ConstructorInjectedController;
import com.alper.spring.controller.PropertyInjectedController;
import com.alper.spring.controller.SetterInjectedController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {

        ApplicationContext abc = SpringApplication.run(Application.class, args);

        //Constructor Injection --Most Preferred
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) abc.getBean("constructorInjectedController");

        String greetingByConstructorInjection = constructorInjectedController.getGreeting();
        System.out.println(greetingByConstructorInjection);

        System.out.println("*********************");//Setter Injection

        SetterInjectedController setterInjectedController = (SetterInjectedController) abc.getBean("setterInjectedController");

        String greetingBySetterInjection = setterInjectedController.getGreeting();
        System.out.println(greetingBySetterInjection);

        System.out.println("*********************");//Propert Injection --Least Preferred

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) abc.getBean("propertyInjectedController");

        String greetingByPropertyInjection = propertyInjectedController.getGreeting();
        System.out.println(greetingByPropertyInjection);

        System.out.println("*********************");

        BeanLifeCycleController beanLifeCycleController = (BeanLifeCycleController) abc.getBean("beanLifeCycleController");

        beanLifeCycleController.getPostConstruct();
        beanLifeCycleController.getPreDestroy();

        System.out.println("*********************");

        OwnPropertyValues ownPropertyValues = (OwnPropertyValues) abc.getBean("ownPropertyValues");

        ownPropertyValues.getProperties();



    }

    @Override
    @Order(2)
    public void run(String... args) throws Exception {
        System.out.println("Do some data loading, or something else !!!\n*********************");
    }
}
