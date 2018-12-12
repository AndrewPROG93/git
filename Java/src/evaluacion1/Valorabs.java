package evaluacion1;

import java.util.Scanner;

public class Valorabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *Lee el valor de un número entero por teclado y
		 *muestra su valor absoluto por pantalla
		 */
		
		int n;
		 
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce un valor al entero");
		n = teclado.nextInt();
		
		
		if (n>0) {
			System.out.println("El valor absoluto de n es:" +n);
		}
		else {
			n = -n;
			System.out.println("El valor absoluto de n es:" +n);
		}
		
	}

}
