package segundaevaluacion;

import java.util.Scanner;

public class DICCIONARIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Realiza la clase Java Diccionario que recibe palabras por
		 *teclado y las almacena en un array de Strings en orden alfab�tico
		 *ascendente hasta que llega una cadena vac�a que no ser� tenida en
		 *cuenta (isEmpty()) o el array est� lleno. Una vez finalizado el
		 *proceso muestra el contenido del array por pantalla.
		 */

		// Necesidades previas
		String words;
		int elements = 0, position;
		String dictionary[] = new String [10];
		
		// Creo el objeto Scanner teclado
		Scanner teclado = new Scanner (System.in);
		
		// Leo un string
		System.out.println("Introduce un string: ");
		words = teclado.nextLine();
		

		elements = 0; // Inicializar la variable
		// A�ado el string words al diccionario de manera ordenada
		while (!words.isEmpty() && elements < 10) {
			
			// Buscar la posici�n
			position = 0;
			while (position < elements) {	
				// Compruebo si es la posici�n correcta
				if (words.compareTo(dictionary[position]) < 0) {
					
					// Si es la posici�n correcta, dejo de buscar y salgo de la busqueda a�adiendo el break
					break;
				}
				
				// Voy a la siguiente posici�n
				position = position + 1;
				
			}
			
			// Desplazo los elementos desde la posici�n una
			 for (int moveposition = elements; moveposition > position; moveposition --) {
				dictionary[moveposition] = dictionary [moveposition - 1];
			
		}
		
		   // Inserto la string words en la posici�n
		     dictionary[position] = words;
		
			// Leo otro string
			System.out.println("Introduce un string: ");
		    words = teclado.nextLine();
	}
	
	   // Libero la memoria asignada al objeto llamado
	    teclado.close();
	    
	    // Muestro el contenido del diccionario
	    for(position = 0; position < elements; position++) {
	    	System.out.println(dictionary[position]);
	}
  }
}
