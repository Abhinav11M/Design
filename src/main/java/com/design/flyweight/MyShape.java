package com.design.flyweight;

/**
 * This is the FlyWeight interface. All the flyweight classes need to implement this
 * @author aabhi
 *
 */
public interface MyShape {
	/* All the extrinsic states to the flyweights will be passed from this api */
	void draw(String font, String color, String size);
}
