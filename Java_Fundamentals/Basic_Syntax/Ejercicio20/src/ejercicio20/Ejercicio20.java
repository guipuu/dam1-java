/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        final int EDAD_MINIMA=12;
        boolean adulto,vip,acceso;
        
        //Pedir datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu edad");
        edad=sc.nextInt();
        System.out.println("Eres VIP (true/false)");
        vip=sc.nextBoolean();
        System.out.println("Vas acompañado (true/false)");
        adulto=sc.nextBoolean();
        

        //Para acceder tienes que tener 12 años o mas , ir con un adulto o tener un pase VIP
        boolean mayorEdad=edad>=EDAD_MINIMA;
        acceso= mayorEdad || adulto || vip ;
        
        System.out.println("Puedes pasar "+acceso);
        
        
    }
    
}
