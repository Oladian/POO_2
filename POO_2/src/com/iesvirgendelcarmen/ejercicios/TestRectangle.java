package com.iesvirgendelcarmen.ejercicios;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(3,5);
	//	System.out.printf("%s%n%s",rec1,rec2);
		
		//TestRectangle test = new TestRectangle();
		
		//test.createObjects(60);
		//System.out.printf("%nCantidad de objetos creados: %d",rec1.getCounter());
		printRectangle(rec1);
		
	}
	
	public void createObjects(int num) {
		for (int i=0; i<num;i++)
			new Rectangle();
	}
	
	public static void printRectangle (Rectangle rect) {
		System.out.printf("Rectangle area and perimeter of %s is %n%.2f %.2f%nCount of rectangles created: %d%n",
				rect.toString(), rect.getArea(),rect.getPerimeter(),Rectangle.getCounter());
		
	}
}
