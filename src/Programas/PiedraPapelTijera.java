package Programas;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

	static int pedirDatoUsuarioInt(String texto) {  //los valores que recibe la función
		int opcionUsuario;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(texto);	           //se llaman PARÁMETROS
		

        try {
            opcionUsuario = teclado.nextInt();
       } catch (Exception error) {
           System.out.println("Debe ingresar un número entre 1 y 3");
           //System.out.println(error);
           opcionUsuario = 0;
           teclado.next();
           
       }
		
		return opcionUsuario;
	}
	
										//parámetro
	static String pasarOpcionAElemento(int opcion) {
		String[] elementos = {"Piedra", "Papel", "Tijera"};
		String elemento = "";
		if (opcion == 1) {
			elemento = elementos[0];
		}else if (opcion == 2) {
			elemento = elementos[1];
		}
		else if (opcion == 3) {
			elemento = elementos[2];
		}
		return elemento;
	}
	  static int aleatorioEntre(int min, int max) {
        Random random = new Random();
        int numAleat = random.nextInt(max - min + 1) + min;
        return numAleat;
    }
	static void mostrarOpciones(String opcion1, String opcion2) {
		System.out.println("**********************");
		System.out.println("Usuario: " + opcion1);
		System.out.println("Computadora: " + opcion2);
		System.out.println("**********************");
	}
	
	public static void iniciar() {
		
		
		int opcionUsuario, opcionComputadora, opcionSalir ;
		String opcionUsuarioStr, opcionComputadoraStr;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*****************************");
		System.out.println("    Piedra, Papel o Tijera");
		System.out.println("*****************************");
		
		do {
			opcionUsuario = pedirDatoUsuarioInt("Elige una opción 1-Piedra 2-Papel 3-Tijera");
			opcionComputadora = aleatorioEntre(1, 3);
			//System.out.println(pasarOpcionAElemento(opcionUsuario));
			
			
			
													//argumento
			opcionUsuarioStr = pasarOpcionAElemento(opcionUsuario);
			opcionComputadoraStr = pasarOpcionAElemento(opcionComputadora);
			// ==
			if (opcionUsuarioStr.equals(opcionComputadoraStr)) {
				System.out.println("¡Empate!");
				mostrarOpciones(opcionUsuarioStr, opcionComputadoraStr);
			} else if ((opcionUsuarioStr.equals("Piedra") && opcionComputadoraStr.equals("Tijera"))
					|| (opcionUsuarioStr.equals("Papel") && opcionComputadoraStr.equals("Piedra"))
					|| (opcionUsuarioStr.equals("Tijera") && opcionComputadoraStr.equals("Papel"))) {
				System.out.println("¡Ganaste!");
				mostrarOpciones(opcionUsuarioStr, opcionComputadoraStr);
			} else {
				System.out.println("¡Perdiste!");
				mostrarOpciones(opcionUsuarioStr, opcionComputadoraStr);
			}
			
			opcionSalir = pedirDatoUsuarioInt("Jugar otra vez? 1-SI 2-NO");
			
			
		}while (opcionSalir != 2);
		
		System.out.println("Gracias por jugar con nosotros!!");
		
	}

}



