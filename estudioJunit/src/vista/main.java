package vista;

import modelo.Calculadora;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc=new Calculadora();
		int suma= calc.suma(3, 2);
		System.out.println(suma);
		
		Calculadora calc2=new Calculadora();
		int resta= calc.resta(3, 2);
		System.out.println(resta);
		
		Calculadora calc3=new Calculadora();
		double sumadb= calc.sumadb(3.4, 2.2);
		System.out.println(sumadb);
		
		Calculadora calc4=new Calculadora();
		int div= calc.div(18, 2);
		System.out.println(div);
	}

}
