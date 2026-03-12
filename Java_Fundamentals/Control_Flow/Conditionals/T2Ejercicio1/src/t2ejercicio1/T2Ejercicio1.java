/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio1;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicita por teclado un número de tipo int al usuario y escribe un programa que muestre true o false, dependiendo de si el número es positivo o no.
        
        int numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero");
        numero=sc.nextInt();
        
        if(numero<=0){
            System.out.println("False");
        }
        if(numero>0){
            System.out.println("True");
        }
        
        
        //Tambien se puede hacer con boolean ya que nos suleta true o false.
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
