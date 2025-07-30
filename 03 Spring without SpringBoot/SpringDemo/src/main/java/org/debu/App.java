package org.debu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Developer obj = (Developer) context.getBean("dev");
//        obj.setAge(21); // what happen if i'm not assign any value to age ?
//        i want to assign some value using Spring so i injecting the value in spring.xml file
//        System.out.println(obj.getAge());
        obj.build();

    }
}
