/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short numMAX = 32767; // Valor máximo permitido para un short
        short numMIN = -32768; // Valor mínimo permitido para un short

// Imprime los límites actuales
        System.out.println("VALOR MAXIMO " + numMAX + " VALOR MINIMO " + numMIN);

        numMAX++; // Incrementa el valor (provoca desbordamiento al mínimo)

// Muestra el resultado del desbordamiento
        System.out.println("NUEVO VALOR MAXIMO: " + numMAX);

    }

}
