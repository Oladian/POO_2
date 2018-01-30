package com.iesvirgendelcarmen.teoria;

public class MiembrosInstanciaEstaticos {
	// Variables de instancia
	
	private int valorNumerico;
	private String valorCadena;
	
	// Variables de clase: llevan STATIC
	
	private static int valorEstaticoNumerico;
	private static String valorEstaticoCadena;
	
	// Constructor por defecto vacío
	
	// public MiembrosInstanciaEstaticos() {}

	// Getters y Setters
	
	public int getValorNumerico() {
		return valorNumerico;
	}

	public void setValorNumerico(int valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

	public String getValorCadena() {
		return valorCadena;
	}

	public void setValorCadena(String valorCadena) {
		this.valorCadena = valorCadena;
		valorNumerico++;
	}

	public static int getValorEstaticoNumerico() {
		return valorEstaticoNumerico;
	}

	public static void setValorEstaticoNumerico(int valorEstaticoNumerico) {
		MiembrosInstanciaEstaticos.valorEstaticoNumerico = valorEstaticoNumerico;
		// valorNumerico++; valorNumerico es una variable de instancia: no es visble para este metodo
	}

	public static String getValorEstaticoCadena() {
		return valorEstaticoCadena;
	}

	public static void setValorEstaticoCadena(String valorEstaticoCadena) {
		MiembrosInstanciaEstaticos.valorEstaticoCadena = valorEstaticoCadena;
	}

	@Override
	public String toString() {
		return "MiembrosInstanciaEstaticos [valorNumerico=" + valorNumerico + ", valorCadena=" + valorCadena
				+ ", getValorNumerico()=" + getValorNumerico() + ", getValorCadena()=" + getValorCadena() + "]";
	}
	
}
