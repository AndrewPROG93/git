package evaluacion1;

import java.util.Scanner;

public class Sumanumw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, posicion, suma;
		
		Scanner teclado = new Scanner (System.in);
		numero = teclado.nextInt();
		
		teclado.close();
		
		posicion = 1;
		suma = 0;
		while (posicion <= numero) {
		
		  suma = suma + posicion;
		  posicion = posicion + 1;
		}
		
		System.out.println(" La suma de los " + numero + " primeros numeros es " + suma);
	}

}
