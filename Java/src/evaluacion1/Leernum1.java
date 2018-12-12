package evaluacion1;

import java.util.Scanner;

public class Leernum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Lee un número entero por teclado, le suma 1, y lo muestra por pantalla
		 */
		
		int d;
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un valor entero");
		
		d = teclado.nextInt();
		System.out.println("El valor de la variable es " + (d + 1));
		teclado.close();
		
	}

}
