/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio3;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero");
        numero=sc.nextInt();
        
        if(numero>0){
        if(numero%2==0){
            System.out.println("El numero es par");      
        }
        
        }
        if(numero%2!=0){
            System.out.println("El numero es impar");
        }
        
        if(numero==0){
            System.out.println("El numero no se si es impar o par");
        }
 
        
    }
    
}
