package com.andromeda.basicDI.Controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.andromeda.basicDI.beans.Audi;
import com.andromeda.basicDI.beans.Maserati;

class CarControllerTest {

	@Test
	void testGetCarName() {
		/*
		 * The following test is used to test dependency injection of Audi and Maserati
		 * classes in CarControl class without the involvement of spring framework
		 */
		CarController audiControl = new CarController(new Audi());
		CarController maseratiControl = new CarController(new Maserati());

		assertEquals("Audi", audiControl.getCarName());
		assertEquals("Maserati", maseratiControl.getCarName());
	}

}
