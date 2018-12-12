package evaluacion1;

import java.util.Scanner;

public class Leercaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char n;
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un valor al caracter");
		
		n = teclado.nextLine().charAt(0); // Asigno el valor leido por teclado a la variable n
		System.out.println("El valor de la variable es " + n);
		teclado.close();
	}

}
