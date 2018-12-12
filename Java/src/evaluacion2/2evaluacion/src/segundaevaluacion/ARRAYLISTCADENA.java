package segundaevaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLISTCADENA {

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
		ArrayList<String> arrayListString= new ArrayList<String>();
		
		// Creo el objeto Scanner teclado
		Scanner teclado = new Scanner (System.in);
		
		// Leo un string
		System.out.println("Introduce un string: ");
		words = teclado.nextLine();
		
	// A�ado el string words al diccionario de manera ordenada
		while (!words.isEmpty()) {
			
			// A�ado el string arrayList
			arrayListString.add(words);
				
			// Leo otro string
			System.out.println("Introduce un string: ");
		    words = teclado.nextLine();
	}
	
	   // Libero la memoria asignada al objeto llamado
	    teclado.close();
	    
	    // Muestro el contenido del diccionario
	    for(int position=0; position<arrayListString.size();position++) {
	    	System.out.println(arrayListString.get(position));
	}
  }
}
