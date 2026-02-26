/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner añoDact = new Scanner(System.in); // Inicializa lector de teclado
        int añoActual; // Variable para año presente
        int añoCliente; // Variable para año de nacimiento

        System.out.println("Año actual : ");
        añoActual = añoDact.nextInt(); // Lee el año actual

        System.out.println("Año de nacimiento : ");
        añoCliente = añoDact.nextInt(); // Lee el año de nacimiento

        int edad = añoActual - añoCliente; // Calcula la diferencia (edad)

// Imprime resultados (corregido a \n para el salto de línea)
        System.out.println("El año actual es " + añoActual + "\nTu año de nacimiento es " + añoCliente + "\nAhora tienes " + edad + " años");
    }

}
