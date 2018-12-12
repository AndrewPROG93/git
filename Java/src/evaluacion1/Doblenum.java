package evaluacion1;

import java.util.Scanner;

public class Doblenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
       *Lee un número entero por teclado, calcula su doble, y lo muestra por pantalla
       */
		
		int d;
		Scanner teclado =new Scanner (System.in);
	    System.out.println("Introduce valor entero");
		
	    d = teclado.nextInt();
	    System.out.println("El valor de la variable es " + d * 2);
	    teclado.close();
		
	}

}
