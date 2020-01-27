package com.design.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeFactory {
	private static Map<ShapeLabel, MyShape> shapes = new ConcurrentHashMap<>();
	
	public synchronized MyShape getShape(String label) {
		MyShape shape = shapes.get(ShapeLabel.stringToShapeLabel(label));
		
		if(shape == null) {
			ShapeLabel shapeLabel = ShapeLabel.stringToShapeLabel(label);
			switch (shapeLabel) {
			case OVAL:
				shape = new MyOval(label);
				break;

			case RECTANGLE:
				shape = new MyRectangle(label);
				break;
				
			default:
				throw new RuntimeException(String.format("Label %s does not correspond to any ShapeLabel", label));
			}
		}
		
		return shape;
	}
}
