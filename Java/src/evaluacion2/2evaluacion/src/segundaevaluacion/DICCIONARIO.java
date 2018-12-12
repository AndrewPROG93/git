package segundaevaluacion;

import java.util.Scanner;

public class DICCIONARIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Realiza la clase Java Diccionario que recibe palabras por
		 *teclado y las almacena en un array de Strings en orden alfabético
		 *ascendente hasta que llega una cadena vacía que no será tenida en
		 *cuenta (isEmpty()) o el array esté lleno. Una vez finalizado el
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
		// Añado el string words al diccionario de manera ordenada
		while (!words.isEmpty() && elements < 10) {
			
			// Buscar la posición
			position = 0;
			while (position < elements) {	
				// Compruebo si es la posición correcta
				if (words.compareTo(dictionary[position]) < 0) {
					
					// Si es la posición correcta, dejo de buscar y salgo de la busqueda añadiendo el break
					break;
				}
				
				// Voy a la siguiente posición
				position = position + 1;
				
			}
			
			// Desplazo los elementos desde la posición una
			 for (int moveposition = elements; moveposition > position; moveposition --) {
				dictionary[moveposition] = dictionary [moveposition - 1];
			
		}
		
		   // Inserto la string words en la posición
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
