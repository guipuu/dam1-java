/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.escudos.griegos;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3EscudosGriegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String caracter;
        int impar;

        System.out.println("Dime el caracter base: ");
        caracter = sc.nextLine();
        System.out.println("Dime un numero impar :");
        impar = sc.nextInt();

        System.out.println("---ESCUDO GENERADO (" + impar + "X" + impar + ")---");
        for (int i = 0; i < impar; i++) {
            for (int j = 0; j < impar; j++) {
                if (j == 0 || i == 0 || i == j || i == impar - 1 || j == impar - 1) {
                    System.out.print(caracter);

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
