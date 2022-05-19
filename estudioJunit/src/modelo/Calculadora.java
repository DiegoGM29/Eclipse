package modelo;

public class Calculadora {
	private int mr;
	public Calculadora() {
		mr=0;
	}
	public int suma(int a,int b) {
		mr=a+b;
		return mr;
		
	}
	
	
	public int resta(int a,int b) {
		mr=a-b;
		return mr;
		
	}
	
	public int suma(int v) {
		mr +=v;
		return mr;
	}
	
	public double sumadb(double a, double b) {
		
		return a + b;
	}
	
	public int div(int a, int b) {
		
		if(b==0)
			throw new ArithmeticException("No puedes dividir por 0");
			
			mr = a/b;
			return mr;
	}
	
	public void operacionOptima() {
		try {
			//No debe tardar mas de 1 segundo
			
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			System.out.println("Operación interrumpida");
		}
	}
	
}
