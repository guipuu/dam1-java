/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cm, m, mm, total; // Variables para las distintas unidades
        Scanner sc = new Scanner(System.in); // Inicializa el lector

        System.out.println("Dime la primera medida (mm)");
        mm = sc.nextInt() / 10; // Lee mm y los pasa a cm (divide entre 10)

        System.out.println("Dime la segunda medida (cm)");
        cm = sc.nextInt(); // Lee los cm directamente

        System.out.println("Dime la tercera medida (m)");
        m = sc.nextInt() * 10; // Lee metros y los pasa a cm (Ojo: 1m son 100cm)

        total = mm + cm + m; // Suma el total convertido a cm
        System.out.println("El total en cm es " + total);
    }

}
