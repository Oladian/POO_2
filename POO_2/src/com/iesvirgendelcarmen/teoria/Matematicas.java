package com.iesvirgendelcarmen.teoria;

import java.util.ArrayList;
import java.util.List;

public class Matematicas {
	public static void main(String[] args) {
		// calculo factorial de un nº
		// 7! = 7*6*5*4*3*2*1
		// 4! = 4*3*8*1
		factorial(29);
		Matematicas matematicas = new Matematicas();
		matematicas.buscarMultiplos(20,3);
		System.out.println((9*1)+(9*2)+(9*4)+(9*8)+(9*5)+(9*10)+(9*9)+(9*7)+(9*3)+(9*6));
	}
	
	public static long factorial (int numero) {
		long fact=1;
		for (int i=numero; i>0;i--) {
			fact*=i;
			//System.out.println(i);
		}
		System.out.println(fact);
		return fact;
	}
	
	// Buscamos multiplos de un nº dentro de un rango
	// buscarMultiplos(20,3) -> 3, 6, 9, 12, 15, 18
	
	public List<Integer> buscarMultiplos(int rango, int numero){
		List<Integer> listaDeMultiplos = new ArrayList<>();
		
		for(int i=numero; i<=rango;i++) {
			if (i%numero==0) 
				listaDeMultiplos.add(i);
		}
		System.out.println(listaDeMultiplos);
		return listaDeMultiplos;
	}
}
