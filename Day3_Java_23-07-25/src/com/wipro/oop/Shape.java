package com.wipro.oop;

public class Shape {
	private String shapeOfObject;
	private String colour;
	public Shape() {
		
	}
	
	public Shape(String shapeOfObject, String colour) {
		this.shapeOfObject=shapeOfObject;
		this.colour=colour;
	}
	public String getShapeOfObject() {
		return shapeOfObject;
	}
	public void setShapeOfObject(String shapeOfObject) {
		this.shapeOfObject = shapeOfObject;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Shape [shapeOfObject=" + shapeOfObject + ", colour=" + colour + "]";
	}
	
	

}
