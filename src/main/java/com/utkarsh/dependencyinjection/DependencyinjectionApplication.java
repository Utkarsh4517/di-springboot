package com.utkarsh.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);
        System.out.println("Hello world");

        ExternalClass obj = context.getBean(ExternalClass.class);
        obj.about();

    }

}
