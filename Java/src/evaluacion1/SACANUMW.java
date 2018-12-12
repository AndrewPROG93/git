package evaluacion1;

import java.util.Scanner;

public class SACANUMW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NECESIDADES PREVIAS
		int numero, posicion;
		
		// SECUENCIA DE PASOS
		Scanner teclado = new Scanner (System.in);
		System.out.println("Numero: ");
		numero = teclado.nextInt();
		
		// Cierro teclado
		teclado.close();
		
		// Muestra los números desde 1 hasta el inclusive
		// Inicio posicion
		posicion = 1;
		while (posicion <= numero) {
			 // Escribir posicion
			System.out.println(posicion);
		  // Actualizo posicion
			posicion = posicion + 1;
		}
	}

}
