package com.iesvirgendelcarmen.teoria;

public class TestClaseAnonima {

	public static void main(String[] args) {
		ClaseAnonima claseAnonima = new ClaseAnonima() {

			@Override
			public void myMethod() {
				System.out.println("Mensaje 1");
				
			}
		};
		
		claseAnonima.myMethod();
		
		new ClaseAnonima() {
			
			@Override
			public void myMethod() {
				System.out.println("Mensaje 2");
				
			}
		}.myMethod();
		
		
	}

}
