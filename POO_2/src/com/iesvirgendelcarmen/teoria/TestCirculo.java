package com.iesvirgendelcarmen.teoria;

import java.util.ArrayList;
import java.util.List;

public class TestCirculo {
	public static void main(String[] args) {
		
		List<Circulo> listaCirculos = new ArrayList<>();
		
		for (int i = 0; i<1000; i++) {
			int radioAleatorio = (int)(Math.random()*1000+1);
			if (radioAleatorio>0)
				listaCirculos.add(new Circulo((int)(Math.random()*1000+1)));
		}
		
		// Se puede acceder a la variable de clase estática.
		System.out.println("Nº circulos creados: "+Circulo.numeroDeCirculos);
		System.out.println(listaCirculos.get(436));
		
		Circulo c = new Circulo();		// Llamada a constructor por defecto
		
		System.out.println(c.getRadio()); // La salida muestra 5, que es el valor por defecto del radio en el objeto.
		
		Circulo b = new Circulo(3);		// Llamada a constructor 2
		int x = 85;
		System.out.println("Valor de X sin llegar al método: "+x);
		method2(x);
		c.setRadio(7);
		method(c);		
		System.out.println("Valor de Circulo sin llegar al método: "+c.getRadio());
		
		System.out.println("Radio del circulo b: "+b.getRadio());
		
		System.out.println("Nº circulos creados: "+Circulo.numeroDeCirculos);
	}
	
	// Pasa por VALOR una posición de memoria, que apunta al int del objeto c. 
	// En Java pasar por VALOR puede tener el mismo efecto que pasar por REFERENCIA (de otro lenguaje).
	// En la pila se almacena la posición de memoria, que apunta al montículo donde tiene su valor.
	// por esto mismo si modificamos el contenido, estamos tocando en el MONTICULO a través de su
	// posición en la pila; que es la referencia de memoria que apunta al objeto del montículo.
	
	public static void method(Circulo c) {
		c.setRadio(8);
		System.out.println("Valor del objeto Circulo en el método: "+c.getRadio());
	}
	
	// Pasa por VALOR el valor de x. Al ser de tipo primitivo, el valor de x se guarda en la pila.
	// El valor varía dentro del método y fuera, ya que ocupa posiciones diferentes de la pila.
	public static void method2(int x) {
		x = 3;
		System.out.println("Valor de X en el método: "+x);
	}

}
