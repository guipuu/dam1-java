/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio6;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        
        System.out.println("Dime tu numero 1: ");
        num1=sc.nextInt();
        System.out.println("Dime tu numero 2:");
        num2=sc.nextInt();
        
        if(num1!=num2){
        
        if(num1>num2){
            System.out.println(num1+" es mayor que "+ num2);
        }else{
            System.out.println(num2+" es mayor que "+ num1);
        }
        }else{
            System.out.println("Son inguales :( ");
        }
    }
    
}
