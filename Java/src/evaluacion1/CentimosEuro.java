package evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Lee una cantidad en euros por teclado y
		 * muestra por separado el número de euros y el número de céntimos de euro
		 */
		
		double cantidad;
		int euros;
		int centimos;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce un valor entero");
		cantidad = teclado.nextDouble(); // Asigno el valor leido por teclado
		teclado.close();
		
		// Calculo euros
		euros = (int)cantidad;
		
		// Calculo centimos
		centimos = (int) ((cantidad - euros) * 100);
		
		// Muestra el resultado en pantalla
		System.out.println("Euros " + euros + " Centimos: " + centimos);
				
	}

}
