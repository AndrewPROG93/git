package evaluacion1;

import java.util.Scanner;

public class EnteroReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
        * Lee un número real por teclado y muestra por separado su parte entera y su parte real. 
        */
		
		double n;
	    int parteentera;
	    double partereal;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Introduce un valor entero: *");
		n = teclado.nextDouble(); // Asigno el valor leido por teclado
		teclado.close();
		
		// Calculo parteentera
		parteentera = (int)n;
		
		// Calculo partereal
		partereal = n - parteentera;
		
		// Muestra el resultado en pantalla
		System.out.println("Parte Entera: " + parteentera + "Parte Real: " + partereal);
		
	}

}
