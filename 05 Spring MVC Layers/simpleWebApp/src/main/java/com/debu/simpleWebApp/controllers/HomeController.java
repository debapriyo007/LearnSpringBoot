package com.debu.simpleWebApp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody // if u use @Controller then u've to use @ResponseBody to return the text.
    public String greet(){
        return "Hi Debu! it's me!!!";
    }

    @RequestMapping("/about-me")
    public String aboutMe(){
        return "A computer science student from Bengal Institute Of Technology. " +
                "Who wants to be a passionate Software Developer eager to learn new things. " +
                "I am driven by curiosity and " +
                "proficient in Java , JavaScript and i'm also a Frontend Developer";
    }
}
