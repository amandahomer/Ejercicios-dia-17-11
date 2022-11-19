/**Este programa muestra la calificacion a partir de la nota media.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio8 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce las tres notas seguidas de un espacio: ");
		
		double nota1 = s.nextDouble();
		double nota2 = s.nextDouble();
		double nota3 = s.nextDouble();
		
		double total;
		total = (nota1 + nota2 + nota3) / 3;
		
		if (total < 5){
			System.out.println("Insuficiente");
		} else if ((total >= 5) && (total <= 6)) {
			System.out.println("Suficiente");
		} else if ((total > 6) && (total <= 7)) {
			System.out.println("Bien"); 
		} else if ((total > 7) && (total <= 8.5)) {
			System.out.println("Notable");
		} else if ((total > 8.5) && (total <= 10)) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Introduce las notas correctas");
		}
		
	}
}
