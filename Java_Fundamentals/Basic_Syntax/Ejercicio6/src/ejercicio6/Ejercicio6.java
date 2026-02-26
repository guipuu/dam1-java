/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1, nota2; // Variables para almacenar las notas

        Scanner notaP = new Scanner(System.in); // Lector 
        System.out.print("Dime tu primera nota:");
        nota1 = notaP.nextFloat(); // Captura el primer decimal

       
        System.out.print("Dime tu segunda nota: ");
        nota2 = notaP.nextFloat(); // Captura el segundo decimal

        double media = (nota1 + nota2) / 2; // Calcula el promedio de ambas

        System.out.println("Tu media es " + media); // Muestra la nota final 
        

    }

}
