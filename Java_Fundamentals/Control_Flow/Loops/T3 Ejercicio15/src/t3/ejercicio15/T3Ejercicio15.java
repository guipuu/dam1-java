/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio15;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    final int CANTIDAD=8;
    int numero,total=0;
        System.out.println("Dime 8 numeros y te hare la media de ellos");
        
        for (int i = 0; i < CANTIDAD; i++) {
            System.out.print("Numero : ");
            numero=sc.nextInt();
            total=total+numero;
        }
        
        double media=total/CANTIDAD;
        System.out.println("La media es "+media);
    
    }
    
}
