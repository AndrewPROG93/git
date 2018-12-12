package evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double cantidad;
		double tipointeres;
		int tiempo;
		double interes;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble(); // Asigno el valor leido
		
		// Leer tipointeres
		System.out.println("Tipo de Interes (3,5%):" );
		tipointeres = teclado.nextDouble();
		
		// Leer tiempo
		System.out.println("Tiempo en dias: ");
		tiempo = teclado.nextInt();
		
		// Libero la memoria asignada al objeto llamado teclado
		teclado.close();
		
		// Calcula el interes
		interes = (cantidad * tipointeres * tiempo) / (360*100);
		
		// Muestra el resultado por pantalla
		System.out.println("El interes es " + interes);
		
	}
	

}
