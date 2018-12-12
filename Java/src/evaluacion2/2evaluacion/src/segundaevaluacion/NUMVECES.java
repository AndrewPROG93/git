package segundaevaluacion;

import java.util.Scanner;

public class NUMVECES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Pide números de 0 a 9 por pantalla y calcula el número
		 *  de veces que han sido introducidos utilizando un array.
		 *  Finaliza la introducción de datos cuando se introduce un
		 *  valor negativo o mayor que 9. Al finalizar la introducción 
		 *  de datos muestra por pantalla el número de veces que se ha
		 *  introducido cada número.
		 */
		
		int n, position;
		int [] arrayenteros = new int [10];
		
		// Pide números de 0 a 9 por pantalla
		Scanner teclado; // Informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner (System.in); // Creo el objeto
		
		// Leo un valor
		System.out.println("Introduce un valor");
		n = teclado.nextInt();
		
		// Calcula el número de veces que han sido introducidos utilizando un array
		// Finaliza la introducción de datos cuando se introduce un valor negativo o mayor
		
		while (n >= 0 && n <= 9) {
			arrayenteros [n] = arrayenteros [n] + 1;
			
			// Leo otro valor
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt();
			
		}
		
		// Libero la memoria asignada al objeto llamado teclado
		teclado.close();
		
		// Al finalizar la introducción de datos muestra por pantalla el número de veces que se ha introducido
		position = 0;
		while (position < 10) {
			System.out.println(position + ":" + arrayenteros [position] + "veces");
			position = position + 1;
		}
	}

}
