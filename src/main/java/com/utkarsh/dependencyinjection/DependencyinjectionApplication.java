package com.utkarsh.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyinjectionApplication.class, args);
        System.out.println("Hello world");
    }

}