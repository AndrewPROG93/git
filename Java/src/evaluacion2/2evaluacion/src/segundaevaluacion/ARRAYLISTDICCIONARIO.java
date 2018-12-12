package segundaevaluacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class ARRAYLISTDICCIONARIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crea la clase ArrayListDiccionario que muestra un menú por pantalla con las siguientes opciones:
		 * 1- Añadir Palabra. Pide una palabra y la añade al array, si todavía no existe, en la posición que le corresponda alfabéticamente.
		 * 2- Buscar Palabra. Pide una palabra y la busca en el array. Si la encuentra la muestra y si no la encuentra muestra un mensaje de error. 
		 * 3- Borrar Palabra. Pide una palabra y la elimina, si es que existe, del array. Si no la encuentra muestra un mensaje de error. 
		 * 4- Listar Diccionario. Muestra todos los elementos del diccionario por pantalla, si es que tiene elementos, ordenados alfabéticamente.
		 * 5- Salir. Realiza las operaciones necesarias para la correcta finalización del programa. 
		 */

		// Necesidades previas
		String words;
		ArrayList<String> dictionary= new ArrayList<String>(); // He renombrado arrayListString por dictionary
		int option;
		
		// Creo el objeto Scanner teclado
		Scanner teclado = new Scanner (System.in);
		
		// Escribo el menu
		System.out.println("1. Añadir palabra");
		System.out.println("2. Buscar palabra");
		System.out.println("3. Borrar palabra");
		System.out.println("4. Listar diccionario");
		System.out.println("0. Salir");
		   // Pido la opción
		System.out.println("Opcion: ");
		option = teclado.nextInt();
		
		while (option != 0);
		   // Con cada opción
		System.out.println("Escribe una de las opciones");
		option = teclado.nextInt();
		
		  switch (option) {
		  
		  case 1:
		    	// Añadir palabra
		    	// Pido una palabra
			    words = teclado.nextLine();
		    	System.out.println("Introduce una palabra");
		    	words = teclado.nextLine();
		    	// Si todavía no existe
		    	if (!dictionary.contains(words)) {
		    	// Añado la palabra
		    	dictionary.add(words);
		    
		    	}
		    	
		   break;
		   
		    case 2:
		    	// Pido una palabra
		    	// Limpio el buffer
		    	System.out.println("Introduce una palabra");
		    	words = teclado.nextLine();
		    	// Busca la palabra en el diccionario
		    	if (!dictionary.contains(words)) {
		    		// Si la encuentra, la muestra
		    		System.out.println("La palabra " + words + " esta en el diccionario");
		    	}
		    	
		   break;
		   
		   case 3:
			   teclado.nextLine();
			   System.out.println("Introduce una palabra");
               words = teclado.nextLine();
               // La busca en el diccionario
               
               if (dictionary.contains(words)) {
            	   // Si la encuentra, la borra
            	   dictionary.remove(words);
            	   System.out.println("La palabra "+ words + " ha sido borrada del diccionario");
               }
               
               else {
            	   System.out.println("Error.class La palabra " + words + " NO está en el diccionario");
               }
		   break;
			   
		   
		   case 4:
			   // Muestra todos los elementos del diccionario por pantalla
			   // Si es que tiene elementos, ordenalos alfabeticamente
			   Collections.sort(dictionary);
			   for (int position = 0; position<dictionary.size();position++) {
		       System.out.println(dictionary.get(position));
		  }
		  
		  break;
		    	
		  }
		
	
	// Leo un string
		System.out.println("Introduce un string: ");
		words = teclado.nextLine();
		
	// Añado el string words al diccionario de manera ordenada
		while (!words.isEmpty()) {
			
			// Añado el string arrayList
			dictionary.add(words);
				
			// Leo otro string
			System.out.println("Introduce un string: ");
		    words = teclado.nextLine();
	}
	
	   // Libero la memoria asignada al objeto llamado
	    teclado.close();
	    
	    // Ordeno diccionario
	    Comparator<String> comparador = Collections.reverseOrder();
	    Collections.sort(dictionary, comparador); 
	    
	    // Muestro el contenido del diccionario
	    for(int position=0; position<dictionary.size();position++) {
	    	System.out.println(dictionary.get(position));
	}
  }
}
