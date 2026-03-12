/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio10;
import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float num1,num2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Dime el primer numero ");
        num1=sc.nextFloat();
        System.out.println("Dime el segundo numero ");
        num2=sc.nextFloat();
        
        float minimo= num1<num2 ? num1:num2;
        float mayor= num1>num2 ? num1:num2;
        
        System.out.println("EL menor es es "+ minimo+" y el mayor "+mayor );
        
        
        
        
        
        
        
    }
    
}
