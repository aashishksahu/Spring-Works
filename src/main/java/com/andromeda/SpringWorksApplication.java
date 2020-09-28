package com.andromeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.andromeda.basicDI.Controllers.CarController;

@SpringBootApplication
public class SpringWorksApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringWorksApplication.class, args);

		/* uncomment the following lines for: */

//	>>	CarController class in com.andromeda.basicDI.Controllers
//	>>	for Dependency Injection Demo
//		System.out.println(ctx.getBean(CarController.class).getCarName());
	}

}
