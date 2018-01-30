package com.iesvirgendelcarmen.teoria;

public class Circulo {
	
	private int radio;	// Atributo o variable de instancia (es una variable del objeto). Se usa encapsulamiento
	
	public static int numeroDeCirculos; // VARIABLE DE CLASE. Debe llevar STATIC.
	
	//public Circulo() {}	// Constructor
	
	public Circulo(int radio) {	// Otro constructor
		this.radio = radio;
		numeroDeCirculos++;
	}
	
	public Circulo() {	// Otro constructor
		this.radio = 5;
		numeroDeCirculos++;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	

}
