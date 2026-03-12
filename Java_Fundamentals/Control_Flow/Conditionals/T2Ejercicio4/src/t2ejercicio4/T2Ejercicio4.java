/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio4;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double importedeCompra, calcdescuento,total;
        final double DESCUENTO=10;
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Dime el importe de la compra");
        importedeCompra=sc.nextDouble();
        calcdescuento=0;
        
        if(importedeCompra>=500){
            calcdescuento=importedeCompra*DESCUENTO/100;
            System.out.println("Tienes el descuento del 10%");
        }
         
        total=importedeCompra-calcdescuento;
        
        
        System.out.println("Debes abonar "+total+" euros");
        
        
        
    
    }
    
}
