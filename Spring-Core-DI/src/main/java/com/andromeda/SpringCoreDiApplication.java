package com.andromeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.andromeda.basicDI.Controllers.CarController;

@SpringBootApplication
public class SpringCoreDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreDiApplication.class, args);

		System.out.println(ctx.getBean(CarController.class).getCarName());

	}

}
