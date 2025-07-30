package com.debu.myApp;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Debugging the code on Laptop...");
    }
}
