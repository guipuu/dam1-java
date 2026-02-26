/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float radio; // Variable para el radio
        Scanner rad = new Scanner(System.in); // Inicializa lector de teclado
        System.out.println("Dime el radio de la circunferencia");
        radio = rad.nextFloat(); // Lee el radio decimal

        double area, lon; // Variables para área y longitud
        area = Math.PI * Math.pow(radio, 2); // Calcula el área (PI * r^2)
        lon = 2 * Math.PI * radio; // Calcula la longitud (He corregido la fórmula a 2*PI*r)

// Imprime resultados con salto de línea
        System.out.println("La longitud es " + lon + "\nEl area es " + area);

    }

}
