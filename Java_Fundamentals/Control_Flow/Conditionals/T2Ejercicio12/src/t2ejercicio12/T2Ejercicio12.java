/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio12;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int num1 , num2 ,num3;
    
        System.out.println("Dime el primer numero");
        num1=sc.nextInt();
        System.out.println("Dime el segundo numero");
        num2=sc.nextInt();
        System.out.println("Dime el tercer numero");
        num3=sc.nextInt();
        
        
        if(num1>num2 && num1>num3 && num2>num3){
            System.out.println(num1+">"+num2+">"+num3);
        }else if(num2>num1&& num2>num3 && num1>num3){
            System.out.println(num2+">"+num1+">"+num3);
        }else if(num3>num2&&num3>num1&&num1>num2){
            System.out.println(num3+">"+num1+">"+num2);
        }else if(num2>num3&&num3>num1&&num1<num2){
            System.out.println(num2+">"+num3+">"+num1);
        }else if(num1>num2&&num3>num2&&num1>num3){
            System.out.println(num1+">"+num3+">"+num2);
        }else if (num3>num2&&num2>num1&&num3>num1){
            System.out.println(num3+">"+num2+">"+num1);
        }
    
    }
    
}
