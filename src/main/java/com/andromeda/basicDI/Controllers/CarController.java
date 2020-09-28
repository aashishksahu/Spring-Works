package com.andromeda.basicDI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.andromeda.basicDI.beans.Car;

@Component
public class CarController {

	private Car newCar;

	@Autowired
	public CarController(@Qualifier("maserati") Car newCar) {
		this.newCar = newCar;
	}

	public String getCarName() {
		return this.newCar.carName();
	}

}
