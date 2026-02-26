/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double infant, adult, total; // Variables para precios calculados

        Scanner sc = new Scanner(System.in); // Inicializa lector de teclado

        System.out.println("Entradas infantiles: ");
        infant = sc.nextDouble() * 15.5; // Lee cantidad y multiplica por precio infantil (15.5)

        System.out.println("Entradas adultas: ");
        adult = sc.nextDouble() * 20; // Lee cantidad y multiplica por precio adulto (20)

        total = adult + infant; // Suma ambos totales

        System.out.println("El precio total es " + total); // Muestra el coste final

    }

}
