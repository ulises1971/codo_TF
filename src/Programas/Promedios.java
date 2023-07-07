package Programas;

import java.util.ArrayList;
import java.util.Scanner;

public class Promedios {
	
	//método cargarNotas
	static ArrayList<Integer> cargarNotas(ArrayList<Integer> listaNotas) {
		int nota;
		Scanner tecladoNota = new Scanner(System.in);
		System.out.println("Ingresar Notas (0-10) 11 para terminar");
		do {			
			nota = tecladoNota.nextInt();
			if(nota <= 10) {
				listaNotas.add(nota);
			}
		} while(nota <= 10);
		return listaNotas;
	}
	
	//método verNotas
	static void verNotas(ArrayList<Integer> listaNotas) {
		System.out.println("*********************************");
		System.out.println(listaNotas);
		System.out.println("*********************************");
	}
	
	//método calcularPromedio
	static double calcularPromedio (ArrayList<Integer> listaNotas) {
		double suma = 0;
		double promedio;
		
		for(int indice = 0; indice < listaNotas.size(); indice++) {
			suma = suma + listaNotas.get(indice);
		}
		
		promedio = suma / listaNotas.size();
		
		return promedio;
	}

	public static void iniciar() {
		//1- Cargar Notas
		//2- Ver Notas cargadas
		//3- Calcular Promedio
		//4- Salir
		
		int opcionUsuario;
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<Integer>();		
		
		System.out.println("Calcular promedio de notas");
		do {			
			System.out.println("Elige una opción");
			System.out.println("1- Cargar Notas");
			System.out.println("2- Ver Notas cargadas");
			System.out.println("3- Calcular Promedio");
			System.out.println("4- Salir");
			
			try {
				opcionUsuario = teclado.nextInt();
		   } catch (Exception error) {
			   System.out.println("Debe ingresar un número entre 1 y 4");
			   System.out.println();
			   //System.out.println(error);
			   opcionUsuario = 0;
			   teclado.next();
			   
		   }


			switch (opcionUsuario) {
			case 1:
				System.out.println("1- Cargar Notas");
				notas = cargarNotas(notas);
				break;
			case 2:
				System.out.println("2- Ver Notas cargadas");
				verNotas(notas);
				break;
			case 3:
				System.out.println("3- Calcular Promedio");
				verNotas(notas);
				System.out.println("El promedio es: " + calcularPromedio(notas));
				System.out.println("*********************************");
				break;
			case 4:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
						
		}while(opcionUsuario != 4);

	}

}

