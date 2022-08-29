package com.example.unidirectional_manytoone_withjointable;

import com.example.unidirectional_manytoone_withjointable.model.Vehicle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class UnidirectionalManyToOneWithJoinTableApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ApplicationContext abc = SpringApplication.run(UnidirectionalManyToOneWithJoinTableApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
