package com.andromeda.basicDI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.andromeda.basicDI.beans.Car;

@Component
/*
 * @Component - used to define a java class as a basic spring bean
 */
public class CarController {

	private Car newCar;

	@Autowired
	/*
	 * @Autowired - Whatever goes below this annotation (Constructor or Setter
	 * preferably) is the point where a dependency is to be injected
	 * 
	 * @Qualifier - When there are multiple implementations of an interface and
	 * spring can't decide which one to use then we can use the @Qualifier([bean
	 * name]) to specify which bean to use
	 */
	public CarController(@Qualifier("maserati") Car newCar) {
		this.newCar = newCar;
	}

	public String getCarName() {
		return this.newCar.name();
	}

}
