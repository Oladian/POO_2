package com.iesvirgendelcarmen.ejercicios;

public class Rectangle {
	private double width;
	private double hight;
	private static int counter=0; //static hace que sea variable de clase, no depende del objeto
	
	public Rectangle() {
		this.width = 1;
		this.hight = 1;
		counter++;
	}

	public Rectangle(double width, double high) {
		this.width = width;
		this.hight = high;
		counter++;
	}
	
	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", hight=" + hight + "]";
	}
	
	public double getArea() {
		return width*hight;
	}
	
	public double getPerimeter() {
		return 2.0*(hight+width);
	}
	
	public class Counter{
		
	}
}
