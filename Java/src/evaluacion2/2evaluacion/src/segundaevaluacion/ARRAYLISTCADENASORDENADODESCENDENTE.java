package segundaevaluacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class ARRAYLISTCADENASORDENADODESCENDENTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crea la clase ArrayListCadenasOrdenadoDescendente que modifica la clase
		 * ArrayListCadenasOrdenado para que las cadenas aparezcan por pantalla en
		 * orden descendente (de mayor a menor).
		 */

		// Necesidades previas
		String words;
		ArrayList<String> arrayListString= new ArrayList<String>();
		
		// Creo el objeto Scanner teclado
		Scanner teclado = new Scanner (System.in);
		
		// Leo un string
		System.out.println("Introduce un string: ");
		words = teclado.nextLine();
		
	// Añado el string words al diccionario de manera ordenada
		while (!words.isEmpty()) {
			
			// Añado el string arrayList
			arrayListString.add(words);
				
			// Leo otro string
			System.out.println("Introduce un string: ");
		    words = teclado.nextLine();
	}
	
	   // Libero la memoria asignada al objeto llamado
	    teclado.close();
	    
	    // Ordeno ArrayList
	    Comparator<String> comparador = Collections.reverseOrder();
	    Collections.sort(arrayListString, comparador); 
	    
	    // Muestro el contenido del diccionario
	    for(int position=0; position<arrayListString.size();position++) {
	    	System.out.println(arrayListString.get(position));
	}
  }
}
