package evaluacion1;

import java.util.Scanner;

public class Leerreal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* leer numero real por teclado y
       * muestra en pantalla el mensaje "El valor de la variable es "
       */

		double n;
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un valor real");
	    n = teclado.nextDouble(); // Asigno el valor leido por teclado a la variable n
	    System.out.println("El valor de la variable es " + n);
	    teclado.close(); // Libero la memoria asignada al objeto llamado teclado

	}

}
