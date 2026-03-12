/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("Dime un numero entero positivo: ");
        numero = sc.nextInt();

        if (numero > 0) {
            while (numero > 0) {
                int cifra = numero % 10;
                System.out.println(cifra);
                numero = numero / 10;
            }
        } else {
            System.out.println("Numero invalido");
        }

    }

}
