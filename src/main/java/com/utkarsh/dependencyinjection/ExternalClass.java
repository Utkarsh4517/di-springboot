package com.utkarsh.dependencyinjection;


import org.springframework.stereotype.Component;

@Component
public class ExternalClass {

    public void about(){
        System.out.println("This is an external class");
    }
}
