package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Calculadora;

class Calculadoratest {
/*
	@Test
	void TestsumaAssert() {
		//fail("Not yet implemented");
		Calculadora calculadora =new Calculadora();
		int actual=calculadora.suma(15, 8);
		int esperado=23;
		assertEquals(esperado, actual,"dospositivos");
		 actual=calculadora.suma(15, -8);
		 esperado=7;
		assertEquals(esperado, actual);
		 actual=calculadora.suma(-15, 8);
		 esperado=-7;
		assertEquals(esperado, actual,"dosnegativos");
		 actual=calculadora.suma(-15, -8);
		 esperado=-23;
		assertEquals(esperado, actual);
	}
*/
	
/*
	@Test
	void TestsumaAssert2() {
		//fail("Not yet implemented");
		Calculadora calculadora =new Calculadora();
		int suma=calculadora.suma(1, 5);
		//Valoramos el resultado de una condición
		assertTrue(suma>10);
		//calculadora=null;
		//Valoramos si un objeto es Null o NoNull
		assertNotNull(calculadora, "La calculadora no está instanciada");
 }
 */

/*
	@Test
	public void Testtipodoble () {
	Calculadora calc=new Calculadora();
	System.out.println("Sumadouble()");
	double resultado = calc.suma(3.501, 1.0);
	double esperado = 4.5;
	
	//assertEquals(esperado, resultado);
	//assertEquals(esperado, resultado, 0.001);
	//assertEquals(esperado, resultado, 0.0001,"Error de precisión");
	}
*/
	
	/*
	@Test
	void assertAllsumatest(){
		Calculadora calc=new Calculadora();
		int suma=calc.suma(3, 2);
		int esperado=5;
		assertAll(
					()->assertEquals(esperado, suma, "Error en la suma"),
					()->assertTrue(suma>10, "Fallo la condición")
					);
				
	}
	*/
	
	//Excepciones controladas
		//En determinadas ocasiones lanzar una excepción es lo correcto,hay que comprobarlas.
	
	
	
	@Test
	void testdivisionporcero() {
		Calculadora calc=new Calculadora();
		assertThrows(ArithmeticException.class, ()->calc.div(10, 0), "Se esperaba que se lanzara la Excepción");
		
	}
	
	
}
