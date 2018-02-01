package com.iesvirgendelcarmen.teoria;

public class My_class {

	public static void main(String[] args) {
		Outer_Demo outer_Demo = new Outer_Demo();
		System.out.println(outer_Demo.getSaludo());
		System.out.println(myMethod());
		
		Outer_Demo.Inner4 inner4 = new Outer_Demo.Inner4();
		inner4.my_method();
		
	}

	private static String myMethod() { // Método
		
		final String mensajeLocal = "Hola desde método local final ";
		class Inner3{ 								// Miembro local del metodo. No puede llevar modificadores salvo final, por estar dentro de un metodo
			private String getMensajeLocal() {		
				return mensajeLocal;
			}
		}
		
		Inner3 inner3 = new Inner3();
		
		return inner3.getMensajeLocal();
	}
	


}

class Outer_Demo {
	private String nombreOuter;

	public String getString() {
		return nombreOuter;
	}

	public void setString(String string) {
		this.nombreOuter = string;
	}
	
	private class Inner_Demo {
		private String nombreInner;

		public Inner_Demo(String nombreInner) {
			this.nombreInner = nombreInner;
		}
		
		public String getSaludo() {
			return "Hola "+nombreInner;
		}
	}
	
	public String getSaludo() {
		Inner_Demo inner_Demo = new Inner_Demo("INNER");
		return "saludo "+inner_Demo.getSaludo();
	}
	
	public static class Inner4 {
		public void my_method() {
			System.out.println("Static nested class");
		}	
	}
	
	
}


