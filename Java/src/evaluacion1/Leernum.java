package evaluacion1;

import java.util.Scanner;

public class Leernum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*
     * Lee un número entero por teclado y
     * lo muestra por pantalla
     */
		
		
	int d;
	Scanner teclado=new Scanner  (System.in);
	System.out.println("Introduce un valor al caracter");
    
    d = teclado.nextInt(); // Asigno un valor al caracter leido por teclado a la variante d
    System.out.println("El valor de la variable es " + d);
    teclado.close();
	}

}
