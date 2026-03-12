/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio2;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int veloci;
    Scanner sc=new Scanner(System.in);
    
        System.out.print("Dime la velocidad del coche: ");
        veloci=sc.nextInt();
        
        if(veloci>120){
            System.out.println("Exceso de velocidad");
        }
    
    
    
    }
    
}
