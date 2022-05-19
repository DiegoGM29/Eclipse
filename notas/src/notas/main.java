package notas;

import java.util.Scanner;

public class main {


	private static int x;
	private static int y;

	public static void main(String[] args) {
		
		System.out.println("pruebagit");
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		String[]alumnos= {"Maria","Luis","Juan","Ana","Pedro"};
		String[]asig = {"PRO","BBDD","LM","SI"};
		//int[][]notas=new int[4][5];
			/*for (x=0;x<asig.length;x++)	{
				System.out.println(asig[x]);
				for (y=0;y<alumnos.length;y++)	{
					System.out.println(alumnos[y]);
					notas[x][y]=leer.nextInt();
					
				}
			}*/
			int[][]notas=  {
					{5,10,4,7,9},
					{8,7,5,9,5},
					{10,5,3,1,4},
					{3,6,7,9,5}};
			
			/*int al=3;
			al--;
			System.out.println(alumnos[al]);
			for (int x=0;x<asig.length;x++)	{
				System.out.print(asig[x] + ": ");
				System.out.println(notas[x][al]);
				
			}*/
			
			/*int op=2;
			op--;
			System.out.println(asig[op]);
			for (int y=0;y<alumnos.length;y++)	{
				System.out.print(alumnos[y] + ": ");
				System.out.println(notas[op][y]);

			}*/
			/*int susp=0;
			for (y=0;y<alumnos.length;y++) {
				for (x=0;x<asig.length;x++) {
					if (notas[x][y]<5)
						susp++;
					
				}
			System.out.println(alumnos[y] +": "); System.out.println(susp);
			susp=0;
			}*/
			
			int sobre=0;
			for (y=0;y<alumnos.length;y++) {
				for (x=0;x<asig.length;x++) {
					
					
				}
			System.out.println(alumnos[y] +": "); System.out.println(sobre);
			sobre=0;
			
		}
	}
	
}
