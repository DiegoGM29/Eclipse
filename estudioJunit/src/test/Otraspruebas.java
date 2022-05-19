package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import modelo.Calculadora;

public class Otraspruebas {
	
	@Disabled("De esta forma podemos deshabilitarla temporalmente")
	@Test
	void testsuma() {
		System.out.println("testsuma()");
		Calculadora calculadora=new Calculadora();
		int suma=calculadora.suma(10, 15);
		int esperado=25;
		assertEquals(esperado, suma);
	}
	
	//Tenemos anotaciones para ejecutar los test en base a una condición. Por ejemplo.
	@Test
	@EnabledOnOs(OS.LINUX)//Ejecutamos si el sistema operativo es Windows
	void testsuma2() {
		System.out.println("testsuma()");
		Calculadora calculadora=new Calculadora();
		int suma=calculadora.suma(10, 15);
		int esperado=25;
		assertEquals(esperado, suma);
	}
	
	@Test
	@EnabledOnOs({OS.LINUX,OS.MAC})
	void testsuma3() {
		System.out.println("testsuma()");
		Calculadora calculadora=new Calculadora();
		int suma=calculadora.suma(10, 15);
		int esperado=25;
		assertEquals(esperado, suma);
	}
	
	//Podemos habilitar o deshabilitar en base al JRE. Que sea uno concreto, un rango...
	@Test
	@EnabledForJreRange(min=JRE.JAVA_14)
	void testsuma4() {
		System.out.println("testsuma()");
		Calculadora calculadora=new Calculadora();
		int suma=calculadora.suma(10, 15);
		int esperado=25;
		assertEquals(esperado, suma);
	}
	
}
