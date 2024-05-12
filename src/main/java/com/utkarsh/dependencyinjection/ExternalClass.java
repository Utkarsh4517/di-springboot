package com.utkarsh.dependencyinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Component annotation tells Spring that it has to create an object of this class using ApplicationContext
@Component
public class ExternalClass {

    @Autowired // Tells Spring to search for this Laptop inside the IoC container
    Laptop laptop;

    public void about(){
        System.out.println("This is an external class");
        laptop.compile();
    }


}
