/**Este programa resuelve una ecuacion de segundo grado.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce el valor de a, b y c seguidos de un espacio: ");
		
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		double cuenta1;
		cuenta1 = b * -1;
		double cuenta2;
		cuenta2 = (b * b) - (4 * a * c);
		double cuenta3;
		cuenta3 = Math.sqrt(cuenta2);
		double cuenta4;
		cuenta4 = 2 * a;
		double totalPositivo;
		totalPositivo = cuenta1 + cuenta3 / cuenta4;
		double totalNegativo;
		totalNegativo = cuenta1 - cuenta3 / cuenta4;
		
		if (a == 0) {
			System.out.print("Esta ecuacion no es de segundo grado.");
		} else if (cuenta2 < 0) {
			 System.out.print("La ecuacion no tiene solucion.");
		} else {
			System.out.println("La ecuacion tiene dos soluciones:");
			System.out.println("x = "+ totalPositivo);
			System.out.println("x = "+ totalNegativo);
			
		}
	}
}
