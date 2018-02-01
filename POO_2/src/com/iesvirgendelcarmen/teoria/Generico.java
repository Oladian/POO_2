package com.iesvirgendelcarmen.teoria;

import java.util.ArrayList;
import java.util.List;

public class Generico<T> {
	private List<T> lista = new ArrayList<>();
	
	public List<T> getLista() {
		return lista;
	}

	public void addItem(T cadena) {
		lista.add(cadena);
	}
	
	public T getItem(int posicion) {
		
		if (posicion>lista.size()) {
			System.out.println("La ultima posicion es: ");
			return null;
		} else
			return lista.get(posicion);
		
	}

	@Override
	public String toString() {
		return "Generico [lista=" + lista + "]";
	}
	
	
}
