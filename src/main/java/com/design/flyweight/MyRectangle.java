package com.design.flyweight;

public class MyRectangle implements MyShape {

	private ShapeLabel label;

	public MyRectangle(String label) {
		this.label = ShapeLabel.stringToShapeLabel(label);
	}

	@Override
	public void draw(String font, String color, String size) {
		System.out.println(String.format("Creating a %s with font %s, "
				+ "color %s and size %s", label.toString(), font, color, size));
	}
	
	

}
