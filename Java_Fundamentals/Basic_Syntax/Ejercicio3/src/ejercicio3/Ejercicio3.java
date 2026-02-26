/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad; //Variable
        Scanner ed = new Scanner(System.in); // Inicializa lector de teclado
        
        System.out.println("Dime tu edad:");
        edad = ed.nextInt(); // Lee el número entero
        
        int suma = edad + 10; // Diferencia de años hasta 2035 (estamos en 2025)
        
        System.out.println("Su edad actual es de " + edad + "\nEn el año 2035 tendrás " + suma + " años");
        
        ed.close(); // Cierra el recurso
    }

}
