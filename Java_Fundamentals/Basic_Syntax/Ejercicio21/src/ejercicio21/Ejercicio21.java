/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, total; // Variables para el número y el resultado
        Scanner sc = new Scanner(System.in); // Inicializa lector de teclado

        System.out.println("Dime el numero de referencia: ");
        final int numeroM = sc.nextInt(); // Define el múltiplo objetivo (ej. 7, 10, 50)

        System.out.println("Dime un numero");
        numero = sc.nextInt(); // Lee el número a comprobar

// Calcula la diferencia para llegar al próximo múltiplo de 'numeroM'
        total = (numeroM - (numero % numeroM)) % numeroM;

        System.out.println("Le falta " + total + " para ser multiplo de " + numeroM);
    }

}
