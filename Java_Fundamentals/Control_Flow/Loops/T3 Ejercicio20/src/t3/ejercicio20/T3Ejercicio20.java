/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio20;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int suspensos = 0, aprobados = 0, dudas = 0, nota;

        for (int i = 1; i <= 7; i++) {
            System.out.println("DIME LA NOTA");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("NOTA NO VALIDA");
                i--;
            } else {
                if (nota >= 5) {
                    aprobados++;

                } else if (nota == 4) {
                    dudas++;
                } else {
                    suspensos++;
                }
            }
        }
        System.out.println("---RESULTADOS---");
        System.out.println(suspensos + "SUSPENSOS");
        System.out.println(aprobados + "APROBADOS");
        System.out.println(dudas + "DUDAS");
    }

}
