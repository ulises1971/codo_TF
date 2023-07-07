package Programas;
import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorCajero {
	
	static String pedirDatoUsuario(String mensaje) {
		String opcionUsuario;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(mensaje);
		opcionUsuario = teclado.nextLine();
		
		return opcionUsuario;				
	}
	
	static boolean login(ArrayList<String> datos) {
		String usuarioIngresado, pinIngresado;
		usuarioIngresado = pedirDatoUsuario("Ingrese su usuario: ");
		
		if (!usuarioIngresado.equals(datos.get(4))) {
			return false;
		}

		pinIngresado = pedirDatoUsuario("Ingrese su PIN: ");

		if (pinIngresado.equals(datos.get(1))) {
			return true;
		} else {
			return false;
		}
	}
	
	
	static void verDatosCliente(ArrayList<String> datos) {
		System.out.println("*****************************");
		System.out.println("Datos del Cliente");
		System.out.println("Nombre y apellido: " + datos.get(0));
		System.out.println("CBU: " + datos.get(2));
		System.out.println("*****************************");
	}
	
	static void verSaldoActual(ArrayList<String> datos) {
		System.out.println("*****************************");
		System.out.println("Saldo Actual");
		System.out.println("Su saldo es: $" + datos.get(3));
		System.out.println("*****************************");
	}
	
	static void realizarDeposito(ArrayList<String> datos) {
		String cantDepositar;
		int saldoActual;		
		
		cantDepositar = pedirDatoUsuario("Ingrese cantidad a depositar: $");
		
		saldoActual = Integer.parseInt(cantDepositar) + Integer.parseInt(datos.get(3));
		
		datos.set(3, Integer.toString(saldoActual));		
	}
	
	static void realizarExtraccion(ArrayList<String> datos) {
		String cantExtraer;
		int saldoActual;		
		
		cantExtraer = pedirDatoUsuario("Ingrese cantidad a extraer: $");
		
		if(Integer.parseInt(cantExtraer) <= Integer.parseInt(datos.get(3))) {
			saldoActual = Integer.parseInt(datos.get(3)) - Integer.parseInt(cantExtraer);
			datos.set(3, Integer.toString(saldoActual));
		} else {
			System.out.println("Fondos insuficientes");
		}			
	}
	
	static void realizarTransferencia(ArrayList<String> datos) {
		String cantTransferir;
		int saldoActual;		
		
		pedirDatoUsuario("Ingrese CBU destinatario: ");
		cantTransferir = pedirDatoUsuario("Ingrese cantidad a Transferir: $");
		
		if(Integer.parseInt(cantTransferir) <= Integer.parseInt(datos.get(3))) {
			saldoActual = Integer.parseInt(datos.get(3)) - Integer.parseInt(cantTransferir);
			datos.set(3, Integer.toString(saldoActual));
		} else {
			System.out.println("Fondos insuficientes");
		}			
	}
	static void consultarMovimientos (ArrayList<String> datos){
		System.out.println();
		System.out.println("Movimientos recientes");
	}
	
	public static void iniciar() {		
		ArrayList<String> datosUsuario = new ArrayList<String>();
		String opcionUsuarioInicio, opcionUsuarioMenu;
		int opcionInt, saldoInt;
		
		//Datos del datosUsuario		
		datosUsuario.add("Juan Pérez");
		datosUsuario.add("1234");
		datosUsuario.add("123456789101112131415");
		datosUsuario.add("100000");
		datosUsuario.add("ulises71");
		
		System.out.println(datosUsuario);		
		
		do {
			
			System.out.println("*****************************");
			System.out.println("Bienvenid@ a su Banco On-Line");
			System.out.println("*****************************");
			
			opcionUsuarioInicio = pedirDatoUsuario("1-Iniciar \n2-Salir \nElige una opción: ");
			
			if(opcionUsuarioInicio.equals("1")) {
				
				if (login(datosUsuario)) {					
				
					do {
						//menú
						System.out.println("*************************************");
						System.out.println("1- Ver Datos del Cliente");
						System.out.println("2- Consultar Saldo Actual");
						System.out.println("3- Realizar Depósito");
						System.out.println("4- Realizar Extracción");
						System.out.println("5- Realizar Transferencia");
						System.out.println("6- Consutar Movimientos");
						System.out.println("7- Salir");
						System.out.println("*************************************");
						
						
						opcionUsuarioMenu = pedirDatoUsuario("Elige una opcion: ");
						
						opcionInt = Integer.parseInt(opcionUsuarioMenu);						
						
						switch (opcionInt) {
						case 1:
							verDatosCliente(datosUsuario);
							break;
						case 2:
							verSaldoActual(datosUsuario);
							break;
						case 3:
							realizarDeposito(datosUsuario);
							verSaldoActual(datosUsuario);
							break;
						case 4:
							realizarExtraccion(datosUsuario);
							verSaldoActual(datosUsuario);
							break;
						case 5:
							realizarTransferencia(datosUsuario);
							verSaldoActual(datosUsuario);
							break;
						case 6:
							consultarMovimientos(datosUsuario);
							break;
						case 7:
							opcionUsuarioInicio = "2";
							break;
						default:
							System.out.println("Opción no válida");
							break;
						}
					} while(opcionInt != 7 );	
					
				} else {
					System.out.println("Usuario o PIN inválido\n");
				}
			}
			
		} while(!opcionUsuarioInicio.equals("2"));
		
		System.out.println("\nNo olvide retirar su tarjeta");
		System.out.println("Gracias por utilizar nuestros servicios");
	}


}