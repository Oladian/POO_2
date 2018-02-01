package com.iesvirgendelcarmen.teoria;

public class TestGenerico {

	public static void main(String[] args) {
		
		Generico generico1 = new Generico();
		
		generico1.addItem("Hola");
		generico1.addItem("hola");
		generico1.addItem("nuevo saludo");
		
		System.out.println(generico1.getLista());
		
		System.out.println(generico1.getItem(2));
		
		Generico generico2 = new Generico();
		Persona persona1 = new Persona("jose", 33);
		Persona persona2 = new Persona("joe", 32);
		Persona persona3 = new Persona("jse", 36);
		Persona persona4 = new Persona("ose", 38);
	
		generico2.addItem(persona1);
		generico2.addItem(persona2);
		generico2.addItem(persona3);
		generico2.addItem(persona4);
		
		System.out.println(generico2);
	}
	
	

}
