package com.design.decorator;

/**
 * Decorator class. This is a decorator interface. This will be customized in the concrete decorators.
 * @author aabhi
 *
 */
public abstract class HouseDecorator implements House {

	protected House house;

	public HouseDecorator(House house) {
		super();
		this.house = house;
	}
	
}
