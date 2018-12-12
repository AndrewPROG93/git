package pruebasED;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculadoraPedirNumero {

	public static void main (String []args) {
		
		float op1 = 0, op2 = 0;
		double res = 0;
		String operacion="";
		
		Calculadora calc = new Calculadora();
			
		try{
			
			//Definicion de bufer de entrada
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			
			//primer operando
	        op1 = pedirnumero();
	        
	        //segundo operando
	        op2 = pedirnumero();
	        
	        //operacion
	        System.out.println("Inserta la operacion (+, -, /, *) por teclado");
	        operacion = bufferRead.readLine();

	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
		
		//hacemos la operacion correspondiente
		switch(operacion) {
		case "+":
			res = calc.suma (op1, op2);
			break;
		case "-":
			res = calc.resta(op1, op2);
			break;
		case "/":
			res = calc.division(op1, op2);
			break;
		case "*":
			res = calc.multiplicacion(op1, op2);
			break;
			default:
		}
		
		System.out.println("El resultado es: " + res);
		
		
	}

	// Pedir n�mero por pantalla, lo recoge por teclado y lo devuelve.
	
	private static float pedirnumero() {
		float num = 0;
		System.out.println("Inserta el primer operando por teclado");
		Scanner teclado = new Scanner (System.in);
		num = teclado.nextFloat();
		return num;
	}

	// Esta funci�n recibe dos n�meros reales y devuelve la suma.
	
	public double suma (float num1, float num2) {
		return num1 + num2;
	}
	
	public double resta (float num1, float num2) {
		return num1 - num2;
	}	

    public double division (float num1, float num2) {
	    return num1 / num2;
}

    public double multiplicacion (float num1, float num2) {
	    return num1 * num2;
    }

}