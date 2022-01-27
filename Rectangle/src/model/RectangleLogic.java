package model;

/**
 * @author DeoTheHung -The Deo
 * CIS175 Spring 2022
 * Jan 26, 2022
 */

public class RectangleLogic {
	public double perimeter(Rectangle rectangle) {
		double perimeter = 0;
		perimeter = 2 * (rectangle.getLength() + rectangle.getWidth());
		return perimeter;
	}
	
	public double area(Rectangle rectangle) {
		double area;
		area = rectangle.getLength() * rectangle.getWidth();
		return area;
	}

}
