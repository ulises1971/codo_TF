package Programas;

import java.util.Scanner;

public class NumeroParImpar {

	public static void iniciar() {
		
		int numero;
		
		Scanner teclado;
		
		System.out.println("Ingrese un número entero  ");
		teclado = new Scanner(System.in);
			
		   
		try {
			numero = teclado.nextInt();
	   } catch (Exception error) {
		   System.out.println("Debe ingresar un número");
		   //System.out.println(error);
		   numero = -1;
		   teclado.next();
		   
	   }	
		
		if (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("El número " + numero + " es par");
			}
			else {
				System.out.println("El número " + numero + " es impar");
			}
		}
		else {
			System.out.println("El 0 no es par ni impar");
		}
		

	}

}
