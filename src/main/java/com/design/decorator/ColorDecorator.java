package com.design.decorator;

public class ColorDecorator extends HouseDecorator {

	public ColorDecorator(House house) {
		super(house);
	}

	public String makeHouse() {
		return house.makeHouse() + addColor();
	}

	private String addColor() {
		return " + Color";
	}
}
