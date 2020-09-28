package com.andromeda.basicDI.beans;

import org.springframework.stereotype.Service;

@Service
public class Audi implements Car {

	@Override
	public String carName() {
		return "Audi";
	}

}
