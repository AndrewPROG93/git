package segundaevaluacion;

import java.util.Scanner;

public class MEDIANUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Pide números por pantalla y
		 * los almacena en un array
		 * hasta que se introduzca un número
		 * negativo que no será tenido en cuenta
		 * o hasta que esté lleno el array.
		 * Despues calcula la Media y la muestra
		 */
		
		// Necesidades previas
		int n, posicion, elementos;
		int [] arrayenteros = new int [5];
		double media;
		
		Scanner teclado; // Informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner (System.in); // Creo el objeto de la clase Scanner llamado teclado
		
		// Antes de leer el valor
		// Muestro un mensaje informativo
		// Leo un valor
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt(); // Asigno el valor leido por teclado a la variable n
		
		elementos = 0;
		
		while (elementos < 5 && n >= 0) {
			arrayenteros [elementos] = n;
			elementos = elementos + 1;
			if (elementos < 5) {
			// Leo otro valor
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt();
		  }
		}
		
		// Libero la memoria asignada al objeto llamado teclado
		teclado.close();
		
		posicion = 0;
		media = 0.0;
		
		while (posicion < elementos) {
			media = media + arrayenteros[posicion];
			posicion = posicion + 1;
		}
		
		media = media / elementos;
		System.out.println("La media es " + media);
	}

}
