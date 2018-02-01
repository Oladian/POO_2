package com.iesvirgendelcarmen.teoria.innerClass;

public class Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uno uno = new Uno("Atributo");
		System.out.println(uno);
		Clase clase = new Clase();
		
	}
	
	public class Dos {
		private int atributo;

		void mostrarDos() {
			Dos dos = new Dos(1);
			//dos.print();
		}
		
		
		
		
		public Dos(int atributo) {
			this.atributo = atributo;
		}

		@Override
		public String toString() {
			return "Dos [atributo=" + atributo + "]";
		}
		
		public class Tres {
			
		}
	}
}

class Uno {
	private String atributo;
	
	public Uno(String atributo) {
		this.atributo = atributo;
	}

	@Override
	public String toString() {
		return "Uno [atributo=" + atributo + "]";
	}
	
	
}