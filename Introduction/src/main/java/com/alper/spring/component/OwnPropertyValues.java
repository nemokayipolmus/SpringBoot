package com.alper.spring.component;

import com.alper.spring.configuration.PropertyConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:own_custom.properties")
public class OwnPropertyValues {
    //Use the environment dependency, you can also get system variables as well
    private final Environment env;

    private String propertyOne;

    //Use a configuration file and a bean
    private String propertyThree;

    //use value in the constructor
    public OwnPropertyValues(Environment env, @Value("${dd.propertyOne}") String propertyOne, String propertyThree) {
        this.env = env;
        this.propertyOne = propertyOne;
        this.propertyThree = propertyThree;
        this.getProperties();
    }

    public void getProperties() {
        System.out.println("Properties one:"+propertyOne);

        String propertyTwo = env.getProperty("dd.propertyTwo");
        System.out.println("Properties two:"+propertyTwo);

        System.out.println("Properties Three:"+propertyThree);
    }


}
