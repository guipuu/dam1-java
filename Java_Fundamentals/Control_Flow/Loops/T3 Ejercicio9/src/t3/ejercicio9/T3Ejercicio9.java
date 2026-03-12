/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio9;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    final int NUM_MAX=100;
    final int NUM_MIN=1;
    
    
    int resultado=0,respuesta,cont=0;
    
    
    
        System.out.println("Preparado para el juego matematico :) ");
        
     do{
         int numero1=(int)(Math.random()*NUM_MAX)+NUM_MIN;
         System.out.println(numero1);
         int numero2=(int)(Math.random()*NUM_MAX)+NUM_MIN;
         System.out.println("+");
         System.out.println(numero2);
         resultado=numero1+numero2;
         respuesta=sc.nextInt();
         
         if(respuesta==resultado)cont++;
     }while(respuesta==resultado);   
    
        System.out.println("Numero de sumas completadas "+cont);
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
