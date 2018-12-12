package evaluacion1;

import java.util.Scanner;

public class Leernumd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int numero;
		
		Scanner teclado = new Scanner (System.in);
		
		
		do {
			
		System.out.println("Dime el numero");
		numero = teclado.nextInt();
		}
		
		while (numero < 0);
		
		// Cerrar teclado
		teclado.close();
		
		// Muestro numero
		System.out.println("El número introducido es el " + numero);
	}

}
