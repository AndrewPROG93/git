package evaluacion1;

import java.util.Scanner;

public class Leercadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n;
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un valor de cadena");
		
		n = teclado.nextLine(); // Asigno el valor leido por teclado a la variable n
		System.out.println("El valor de la variable es " + n);
	    teclado.close();

}
}