package evaluacion1;

import java.util.Scanner;

public class Signonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Lee un número entero por teclado, lo cambia de signo, y lo muestra por pantalla 
		 */
		
		int d;
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce valor a la variable");
		
		d = teclado.nextInt();
		d = -d;
		System.out.println("El valor de la variable es " + d);
		teclado.close();
	}

}
