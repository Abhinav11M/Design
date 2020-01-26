package com.design.decorator;

public class LightsDecorator extends HouseDecorator {

	public LightsDecorator(House house) {
		super(house);
	}

	public String makeHouse() {
		return house.makeHouse() + addLights();
	}
	
	private String addLights() {
		return " + Lights";
	}

}
