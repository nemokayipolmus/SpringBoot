package com.alper.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//create you own configuration file and create a bean that can be injected into you class
@Configuration
@PropertySource("classpath:application.properties")
public class PropertyConfig {

    @Value("${dd.propertyThree}") //Its not matter at all which is private variables or public when this variable get() function with a @Bean annotation its going to be public
    private String propertyThree;

    @Bean
    public String getPropertyThree() {
        return propertyThree;
    }



}
