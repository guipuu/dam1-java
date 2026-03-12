/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio23;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("Dime el numero de marcas en la fila mayor: ");
        numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
