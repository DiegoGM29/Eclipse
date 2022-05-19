package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SuiteDisplayName;

import modelo.Calculadora;

public class Calculadoratest2 {
	static Calculadora calculadora=null;
	//Mejor legibilidad de nuestros test con @DisplayName
	
	
	
	@Test
	@DisplayName("Probamos la suma de la calculadora")
	void testsuma() {
		System.out.println("testsuma()");
		//Calculadora calculadora=new Calculadora();
		int suma=calculadora.suma(10, 15);
		int esperado=25;
		assertEquals(esperado, suma);
	}
	
	
	
	@Test
	@DisplayName ("Probamos la resta de la calculadora.")
	void testresta() {
		System.out.println("testresta()");
		//Calculadora calculadora=new Calculadora();
		int resta=calculadora.resta(15, 5);
		int esperado=10;
		assertEquals(esperado, resta);
	}
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculadora=new Calculadora();
		System.out.println("Se ejecuta antes de todos los test");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		calculadora=null;
		System.out.println("Se ejecuta después de todos los test");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Se ejecuta después de cada test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Se ejecuta después de cada test");
	}

}
