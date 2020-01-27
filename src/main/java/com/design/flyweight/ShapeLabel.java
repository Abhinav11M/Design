package com.design.flyweight;

public enum ShapeLabel {
	RECTANGLE,
	OVAL;
	
	public static ShapeLabel stringToShapeLabel(String label) {
		switch (label) {
		case "Oval":
			return OVAL;

		case "Rectangle":
			return RECTANGLE;

		default:
			throw new RuntimeException(String.format("Label %s "
					+ "cannot be identified as a valid label", label));
		}
	}
}
