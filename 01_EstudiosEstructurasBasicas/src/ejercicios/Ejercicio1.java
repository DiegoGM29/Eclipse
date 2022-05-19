package ejercicios;

public class Ejercicio1 {

	public Ejercicio1() {
		System.out.println("Fibonacci------------");
		int cant=12;	/*¿Cuantas numeros quiero?*/
		
		int ant;
		ant=0;
		
		int sig;
		sig=1;
		
		int fibo;
		
		for(int x=0;x<cant;x++)	{
			fibo=ant+sig;
			System.out.print(fibo+"-");
			ant=sig;
			sig=fibo;			
			
		}
		
	}

}
