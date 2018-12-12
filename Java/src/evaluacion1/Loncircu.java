package evaluacion1;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*
		 *  Lee el valor del radio por teclado y 
		 *  muestra el valor de la circunferencia
		 *  de ese radio por pantalla con dos decimales
		 */
		
		double radio;
		double resultado;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce el valor para el radio");
		
		radio = teclado.nextDouble(); // Asigno el valor leido por teclado
			    teclado.close();
			
	    // Calcula el valor de la circunferencia de ese radio
	    resultado = Math.PI 2 * PI * radio;
			
			   // Muestra el resultado por pantalla
			   System.out.println("El valor de la circunferencia es " + resultado);
		
	}
	
	    
	

}
