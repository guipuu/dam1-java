/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        double x,y;
        Scanner sc=new Scanner(System.in);
        
        //Pedimos los valores de a b  c y x
        System.out.println("Dime el valor de a ");
        a=sc.nextDouble();
        System.out.println("Dime el valor de b");
        b=sc.nextDouble();
        System.out.println("Dime el valor de c");
        c=sc.nextDouble();
        System.out.println("Dime el valor de x");
        x=sc.nextDouble();
        

        //Calculamos y = a*x2+b*x+c
        
        y=a*Math.pow(x,2)+b*x+c;
        
        
        
       //Mostramos resultados
        System.out.println("Y es "+y);
       
    }
    
}
