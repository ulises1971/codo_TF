package Programas;

import java.util.Scanner;

public class FactorialDeUnNumero {

	public static void iniciar() {
		
		int numero, contador, acumulador;
		Scanner teclado;
		
		System.out.println("Ingrese un número entero");
		teclado = new Scanner(System.in);
		  
         try {
           numero = teclado.nextInt();
       } catch (Exception error) {
           System.out.println("Debe ingresar un número, no texto");
           //System.out.println(error);
          numero = 0;
           teclado.next();
           
       }
		
		contador = 1;
		acumulador = 1;
		//factorial de 5= 5*4*3*2*1
		do {
			acumulador = acumulador * contador;
			contador++;
			
		} while (contador <= numero);
		System.out.println("El Factorial de " + numero + " es " + acumulador);

	}

}

