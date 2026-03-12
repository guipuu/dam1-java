/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio6;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    //RANGO DE EL JUEGO
    final int NUM_MIN=1;
    final int NUM_MAX=100;
    
    int numeroculto = (int)(Math.random()*NUM_MAX)+NUM_MIN;
    System.out.println("Adivina un numero del 1-100");
    int intento=sc.nextInt();
    int contador = 0;
    
    while(intento!=numeroculto &&intento!=-1){
    contador++;
    
    if(intento>numeroculto){
        System.out.println("El numero es menor");
    }else if(intento<numeroculto){
        System.out.println("El numero es mayor");
    }
        System.out.println("Prueba otra vez ");
        intento=sc.nextInt();
    }
        
    if(intento==numeroculto){
    contador++;
            System.out.println("Has acertado");
            System.out.println("Numero de intentos: "+contador);
    }else{
        System.out.println("Te has rendido");   
   }    
 }
}
