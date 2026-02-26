/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, total; // Variables para el número y el resultado
        Scanner sc = new Scanner(System.in); // Inicializa lector de teclado

        System.out.println("Dime un numero");
        numero = sc.nextInt(); // Lee el número entero

// Calcula cuánto falta para el siguiente múltiplo de 7
        total = (7 - (numero % 7)) % 7;

        System.out.println("Le falta " + total + " para ser multiplo de 7"); // Imprime el resultado
    }

}
