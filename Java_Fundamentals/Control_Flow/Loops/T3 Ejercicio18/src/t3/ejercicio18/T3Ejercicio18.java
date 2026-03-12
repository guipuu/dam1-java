/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio18;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;
        int factorial = 1;
        System.out.println("Dime un numero");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println(numero + "!");
            for (int i = numero; i >= 1; i--) {

                System.out.print(i);
                if (i > 1) {
                    System.out.print(" x ");
                }
                contador++;
                factorial = factorial * contador;
            }

            System.out.println(" = " + factorial);

        } else {
            System.out.println("NO VALE");
        }
    }

}
