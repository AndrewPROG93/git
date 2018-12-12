package evaluacion1;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;
		double resultado;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce un valor para el radio: ");
		radio = teclado.nextDouble(); // Asigno el valor leido por teclado
		teclado.close();
		
		// Calcula el valor del circulo de ese radio
		resultado = Math.PI * radio * radio;
		
		// Muestra el resultado por pantalla
		System.out.println("El valor del circulo es " + resultado);
	}

}
