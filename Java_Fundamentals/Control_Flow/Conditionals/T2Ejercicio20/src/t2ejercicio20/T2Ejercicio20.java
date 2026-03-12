/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio20;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    double euro;
    int opcion;
        System.out.println("Dime tus euros");
        euro=sc.nextDouble();
        System.out.println("Dime a que quieres pasar los euros: "
                + "\n 1.USD"
                + "\n 2.CHF"
                + "\n 3.MXN"
                + "\n 4.JPY"
                + "\n 5.GBP");
        System.out.print("Elige: ");
        opcion=sc.nextInt();
        
    switch(opcion){
        case 1 ->{
            euro=euro*1.1739;
            System.out.println("Tienes "+euro+" USD");
        }
        case 2 ->{
            euro=euro*0.9347;
            System.out.println("Tienes "+euro+" CHF");
        }
        case 3 ->{
            euro=euro*21.64;
            System.out.println("Tienes "+euro+" MXN");
        }
        case 4 ->{
            euro=euro*173.79;
            System.out.println("Tienes "+euro+" JPY");
        }
        case 5 ->{
            euro=euro*0.87315;
            System.out.println("Tienes "+euro+" GBP");
        }
    }
    
    
    
    
       
    
    }
    
}
