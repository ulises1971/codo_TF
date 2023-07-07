package Programas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcionUsuario;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Mis Programas");

        do{
           
            System.out.println();
            System.out.println("1- Piedra, papel o tijera");
            System.out.println("2- Mis notas");
            System.out.println("3- Simulador de Cajero");
            System.out.println("4- Factorial de un número");
            System.out.println("5- Número par o impar");
            System.out.println("6- Lista de compras");
            System.out.println("7- Convertor de Temperatura");
            System.out.println("8- Salir");
            System.out.println();
            System.out.print("Elije una opción  ");
            
            try {
                 opcionUsuario = teclado.nextInt();
            } catch (Exception error) {
                System.out.println("Debe ingresar un número entre 1 y 8");
                //System.out.println(error);
                opcionUsuario = 0;
                teclado.next();
                
            }
           

            switch (opcionUsuario) {
                case 1:
                     PiedraPapelTijera.iniciar();

                    break;
                case 2:
                    Promedios.iniciar();
                    break;
                case 3:
                    SimuladorCajero.iniciar();
                    break;
                 case 4:
                     FactorialDeUnNumero.iniciar();
                    break;
                 case 5:
                    NumeroParImpar.iniciar();
                    break;
                 case 6:
                    ListaDeCompras.iniciar();
                    break;
                case 7:
                    ConvertorDeTemperatura.iniciar();
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Te esperamos la próxima");
                    break;
            
                default:
                    System.out.println("Opción no valida");
                    break;
            }


        } while (opcionUsuario != 8);
       
    }
}
