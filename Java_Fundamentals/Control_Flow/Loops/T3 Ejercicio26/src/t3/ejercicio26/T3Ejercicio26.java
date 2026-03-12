/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio26;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        //variables
        int alto;
        int ancho;

        //pedir datos 
        System.out.println("Dime el alto de tu rectangulo");
        alto = sc.nextInt();
        System.out.println("Dime el ancho de tu rectangulo");
        ancho = sc.nextInt();

        //Ejecucion
        for (int i = 0; i < alto; i++) {
            //Elegir el caracter
            for (int j = 0; j < ancho; j++) {

                if (j == 0 || i == alto - 1 || i == 0 || j == ancho - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

        }
    }

}
