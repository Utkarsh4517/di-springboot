package com.utkarsh.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile(){
        System.out.println("Compiling program..");
    }
}
