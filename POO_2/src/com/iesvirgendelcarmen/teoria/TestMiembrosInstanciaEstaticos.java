package com.iesvirgendelcarmen.teoria;

public class TestMiembrosInstanciaEstaticos {

	public static void main(String[] args) {

		MiembrosInstanciaEstaticos m1 = new MiembrosInstanciaEstaticos();
		
		m1.setValorNumerico(1);
		m1.setValorCadena("uno");
		m1.setValorEstaticoNumerico(10);
		m1.setValorEstaticoCadena("diez");
		
		MiembrosInstanciaEstaticos m2 = new MiembrosInstanciaEstaticos();
			
		System.out.printf("Variables de instancia: %d %s%n "
				+ "Variables de clase: %d %s%n",
				m1.getValorNumerico(),m1.getValorCadena(),
				m1.getValorEstaticoNumerico(),m1.getValorEstaticoCadena());
		
		m2.setValorEstaticoNumerico(15);
		m2.setValorEstaticoCadena("quince");
		
		System.out.printf("Variables de instancia: %d %s%n "
				+ "Variables de clase: %d %s%n",
				m2.getValorNumerico(),m2.getValorCadena(),
				m2.getValorEstaticoNumerico(),m2.getValorEstaticoCadena());
		
		
		// Como son variables de la clase, son visibles y únicos para todo
		System.out.println(MiembrosInstanciaEstaticos.getValorEstaticoNumerico());

	}

}
