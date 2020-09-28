package com.andromeda.basicDI.beans;

import org.springframework.stereotype.Service;

@Service
/*
 * @Service - used to define a java class as a stand-alone business spring bean
 * with the business logic or algorithm
 */
public class Maserati implements Car {

	@Override
	public String carName() {
		return "Maserati";
	}

}
