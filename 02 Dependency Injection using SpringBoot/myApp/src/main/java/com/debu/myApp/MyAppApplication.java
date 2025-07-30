package com.debu.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		// Fetching the Developers bean from the application context
		Developers developers = context.getBean(Developers.class);
		// Calling the build method on the Developers bean
		developers.build();
	}

}
