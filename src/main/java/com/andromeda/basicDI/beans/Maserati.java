package com.andromeda.basicDI.beans;

import org.springframework.stereotype.Service;

@Service
public class Maserati implements Car {

	@Override
	public String carName() {
		return "Maserati";
	}

}
