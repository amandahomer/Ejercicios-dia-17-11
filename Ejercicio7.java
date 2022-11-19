/**Este programa calcula la media de tres notas.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio7 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce las tres notas seguidas de un espacio: ");
		
		double nota1 = s.nextDouble();
		double nota2 = s.nextDouble();
		double nota3 = s.nextDouble();
		
		double total;
		total = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("La media de las tres notas es: "+ total);
		
	}
}
