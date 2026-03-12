/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.stringprueba;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3STRINGPRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String nombre;
        int longitud;
        String espacios;

        System.out.print("Dime tu nombre entero: ");
        nombre = sc.nextLine();
        longitud = nombre.length();

        for (int i = 0; i < longitud; i++) {
            System.out.println(nombre.charAt(i));
        }
        espacios=nombre.replace(" ", "");
        longitud=espacios.length();
        
        System.out.println("Numero de caracteres mas los espacios : " + longitud);

    }

}