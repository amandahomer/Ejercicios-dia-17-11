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
		
		double cuadrado;
		cuadrado = Math.pow(b,2);
		double cuenta1;
		cuenta1 = cuadrado - 4 * a * c;
		double raiz;
		raiz = Math.sqrt(cuenta1);
		double totalPositivo;
		totalPositivo = (-b + cuenta1) / (2 * a);
		double totalNegativo;
		totalNegativo = (-b - cuenta1) / (2 * a);
		
		if (a == 0) {
			System.out.print("Esta ecuacion no es de segundo grado.");
		} else if (cuenta1 < 0) {
			 System.out.print("La ecuacion no tiene solucion.");
		} else {
			System.out.println("La ecuacion tiene dos soluciones:");
			System.out.println("x1 = "+ totalPositivo);
			System.out.println("x2 = "+ totalNegativo);
			
		}
	}
}
