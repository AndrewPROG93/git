package evaluacion1;

import java.util.Scanner;

public class Tabnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     int nota;
     
     Scanner teclado = new Scanner (System.in); /* Informo de que necesito un
                                                   objeto de clase Scanner llamado teclado,
                                                   creo el objeto de la clase Scanner llamado
                                                   teclado*/
                                                   
     // Leer nota
     System.out.println("Nota");
     nota = teclado.nextInt(); // Asigno el valor leido por teclado a la variable n

     // Libero la memoria asignada al objeto llamado teclado
     teclado.close();
     
     if (nota >= 0) {
    	 if (nota < 3) {
    		 System.out.println("MD");
    	 }
    	
    	 else if (nota < 5) {
    	     System.out.println("INS");
         }
         else if (nota < 6) {
             System.out.println("SUF");
    	 }
	     else if (nota < 7) {
	         System.out.println("BIEN");
         }
         else if (nota < 9) {
             System.out.println ("NOT");
         }
         else if (nota <= 10) {
        	 System.out.println("SOBRE");
         }
             }
	}

}
