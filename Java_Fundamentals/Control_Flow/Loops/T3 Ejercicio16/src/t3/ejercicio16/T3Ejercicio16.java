/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    
    int total=0;
    int numero;
        System.out.println("Dime el numero: ");
        numero=sc.nextInt();
    int impar;
    
    impar=numero*2-1;
    
        for (int i = 0; i <= numero; i=i+2) {
            total=i+total;
            
        }
        System.out.print("TOTAL: ");
        System.out.println(total   );
        
    }
    
}
