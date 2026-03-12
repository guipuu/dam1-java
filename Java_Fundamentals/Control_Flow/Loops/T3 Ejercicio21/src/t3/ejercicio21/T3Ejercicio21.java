/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio21;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc=new Scanner(System.in);  
      
        for (int i = 1; i <= 10; i++) {
            System.out.println("TABLA DEL "+i);
            
            
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+j+" = "+i*j);
            }
            
        }
        
        
    }
    
}
