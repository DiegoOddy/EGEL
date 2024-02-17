
package com.mycompany.cajeroautomatico;

import java.util.Scanner;

public class CajeroAutomatico{
    private static final int Saldo_Inicial=1000;
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        while(true){
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1 -> consultarSaldo();
                case 2 -> retirarDinero(scanner);
                case 3 -> {
                    System.out.println("Saliendo del cajero automatico...");
                    return;
                }
                default -> System.out.println("Opcion Invalida");
            }
        }
    }
    
    private static void mostrarMenu(){
        System.out.println(" ");
        System.out.println("-----CAJERO AUTOMATICO-----");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Retirar Dinero");
        System.out.println("3. Salir");
        System.out.println("Elija una opcion: ");
    }
    
    private static void consultarSaldo(){
        System.out.println(" ");
        System.out.println(" Su saldo actual es: " + Saldo_Inicial);
        System.out.println(" ");
    }
    
    private static void retirarDinero(Scanner scanner){
        System.out.println(" ");
        System.out.println("Introduzca el monto a retirar: ");
        int montoRetiro=scanner.nextInt();
        
        if(montoRetiro > Saldo_Inicial){
            System.out.println(" ");
            System.out.println("Saldo Insuficiente");
        }
        else {
            System.out.println(" ");
            System.out.println("Retirando dinero $" + montoRetiro);
            int nuevoSaldo= Saldo_Inicial - montoRetiro;
            System.out.println("Su nuevo saldo es: " + nuevoSaldo);
        }
    }
}