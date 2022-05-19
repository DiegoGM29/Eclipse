package modelo;

public class Persona {
	private String nombre;
	private String población;
	private String dni;
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre,String población, String dni) {
	super();
	this.nombre=nombre;
	this.población=población;
	this.dni=dni;
}

public static boolean compruebaDni(String dni) {
	boolean dniCorrecto=true;
	String letrasDNI="TRWAGMYFPDXBNJZSQVHLCKE";
	dni=dni.toUpperCase();
	if(dni.length()==9) {
		String numeroDNI=dni.substring(0, 8);
		char letra=dni.charAt(8);
		System.out.println(numeroDNI+"-"+letra);
		try {
			int numDni=Integer.parseInt(numeroDNI);
			int resto = numDni % 23;
			char letraDni=letrasDNI.charAt(resto);
			System.out.println("---"+letraDni+"-----");
			if(letra==letraDni)
				System.out.println("DNI Correcto");
			else {
				System.out.println("DNI Incorrecto");
				dniCorrecto=false;}
			
			} catch (NumberFormatException e) {
				dniCorrecto=false;
			 
		}
	}
	else {
		System.out.println("Dni Incorrecto");
		dniCorrecto=false;
		}
	return dniCorrecto;
	
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", población=" + población + "]";
	}

} //End 


