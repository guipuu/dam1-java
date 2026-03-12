/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio4;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
        int numero=1;
    

    
    while(numero!=0){
        System.out.print("Dime un numero: ");
        numero=sc.nextInt();
        
        if(numero%2==0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
        
        if(numero>0){
            System.out.println("Numero positivo");
        }else{
            System.out.println("Numero negativo");
        }
        System.out.println("Su cuadrado es: "+numero*numero);
    }    
  }    
}
