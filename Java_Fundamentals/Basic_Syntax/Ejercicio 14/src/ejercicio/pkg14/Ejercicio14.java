/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double iva,baseimp,impor;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Dime el IVA:");
        iva=sc.nextDouble();
        System.out.println("Dime el importe:");
        impor=sc.nextDouble();
        
        
        baseimp=impor/(1+iva/100);
        System.out.println("La base es "+baseimp);
        
    }
    
}
