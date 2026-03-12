/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio5;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos las variables
        Scanner sc=new Scanner(System.in);
        byte num1,num2;
        
        //Pedimos la informacion 
        System.out.print("Dime tu primer numero: ");
        num1=sc.nextByte();
        System.out.print("Dime tu segundo numero: ");
        num2=sc.nextByte();
        
        //Calculamos
        
        if(num1==num2){
            System.out.println(num1+" es igual que "+num2);
        }else{
            System.out.println("Tus numeros no son iguales ");
        }
    
        
    }
    
}

