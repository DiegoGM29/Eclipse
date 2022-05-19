package ejercicios;

public class Ejercicio2 {

	public Ejercicio2() {
		System.out.println("Numeros primos---------");
		int num=38; /*Número que queremos saber si es primo*/
		boolean primo=true;
		int div=0;
		for(int x=2;x<(num-1);x++) {
			div= num % x;
			if (div==0) {
				primo=false;
				break;
				
			}

		}
		
		if (primo) 
			System.out.println("Primo");
		else
			System.out.println("No es primo");
		
	}

}
