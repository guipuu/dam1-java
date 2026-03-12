/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio24;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    String cadena1;
    String cadena2;
    
        System.out.println("FRASE 1: ");
        cadena1=sc.nextLine();
        System.out.println("FRASE 2:");
        cadena2=sc.nextLine();
        
     
     if(cadena1.length()>cadena2.length()){
         System.out.println("La frase: "+cadena2+"\nES MAS PEQUEÑA");
     }else{
         System.out.println("La frase: "+cadena1+"\nES MAS PEQUEÑA");
     }
    
    }
    
}
