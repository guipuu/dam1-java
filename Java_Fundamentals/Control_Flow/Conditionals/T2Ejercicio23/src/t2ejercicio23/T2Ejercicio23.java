/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio23;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    double aforoMax,precio,numentra,importe;
    
        System.out.println("Dime el aforo maximo de la sala :");
        aforoMax=sc.nextDouble();
        System.out.println("Dime el precio de la entrada : ");
        precio=sc.nextDouble();
        System.out.println("Cuanta gente entra en la sala y compra la entrada : ");
        numentra=sc.nextDouble();
        double descuento= 25*precio/100;
        
        if(numentra<=(20*aforoMax/100)){
            System.out.println("El concierto se cancela");
        
        }else{
            System.out.println("El concierto va a comenzar paguen sus entradas ");
            if(numentra<=(50*aforoMax/100)){
                System.out.println("Rebaja de 25% por poco aforo");
                importe=numentra*precio-descuento;
                System.out.println("Recaudamos "+importe+" euros");
                
            }else{
                importe=numentra*precio;
                System.out.println("Recaudamos "+importe+" euros");
            }
        }
    }
    
}
