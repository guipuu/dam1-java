/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte edad; // Variable para edad (usa menos memoria)
        Scanner ed = new Scanner(System.in); // Lector de teclado
        System.out.print("Dime tu edad: ");
        edad = ed.nextByte(); // Lee el valor como byte
        boolean esMayor = edad >= 18; // Compara si es mayor o igual a 18
        System.out.println("La persona es mayor de edad: " + esMayor); // Imprime true o false

    }

}
