package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*
		 * Lee un número por teclado y calcula el cubo de ese número
		 */
		
		double n;
		double resultado;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce un valor para n: ");
		n = teclado.nextDouble(); // Asigno el valor leido por teclado
		
		// Libero la memoria asignada al objeto llamado teclado
		teclado.close();
		
		// Calcula el valor del cubo
		resultado = n * n * n;
		
		// Muestra el resultado por pantalla
		System.out.println("El valor del cubo es " + resultado);
	}

}
