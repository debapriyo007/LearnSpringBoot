package com.debu.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developers {

    @Autowired //this is called Field Injection | To make connection between Developers and Laptop we are using @Autowired annotation
    @Qualifier("laptop") // This is used to specify which bean to inject when there are multiple candidates
    private Computer comp;

    //It can also be done using Constructor Injection also.
//    public Developers(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void  build(){
        comp.compile();
        System.out.println("Building some awesome application...");
    }
}
