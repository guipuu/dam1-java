/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio7;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero decimal");
        numero=sc.nextDouble();
        
        
        if(numero>-1.0&&numero<1.0 && numero!=00){
            System.out.println("Tu numero casi es cero");
        }else{
            System.out.println("Tu numero no es casi cero");
        }
        
        
        
        
        
    }
    
}
