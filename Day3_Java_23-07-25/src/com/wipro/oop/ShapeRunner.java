package com.wipro.oop;

public class ShapeRunner {

	public static void main(String[] args) {
		Shape shape=new Shape("","");
		Circle circle=new Circle();
		circle.setColour("Green");
		circle.setShapeOfObject("Round");
		System.out.println(circle);
		Square square=new Square();
		square.setColour("Blue");
		square.setShapeOfObject("squareShape");
		System.out.println(square);
		Rectangle rectangle=new Rectangle();
		rectangle.setColour("Yellow");
		rectangle.setShapeOfObject("rectangleShape");
		System.out.println(rectangle);

	}

}
