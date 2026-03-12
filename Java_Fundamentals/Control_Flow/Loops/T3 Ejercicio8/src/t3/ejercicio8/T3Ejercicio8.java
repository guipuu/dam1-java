/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio8;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    final int NUM_MAX=100;
    final int NUM_MIN=1;
    
    int cont=0,resultado=0,respuesta;    
    
System.out.println("Se te van a mostrar varios numeros y tendras que decir el resultado de la suma de todos  \n Pulsa 0 si quieres añadir otro numero si no pulsa 1 ");
   


    while(cont!=1){
    int numero= (int) (Math.random()*NUM_MAX)+NUM_MIN;
        System.out.println(numero);
        resultado=resultado+numero;
        System.out.println("Quieres un numero mas ?");
        cont=sc.nextInt();
        
    }
        System.out.println("Dime el resultado final :");
        respuesta=sc.nextInt();
        if(respuesta==resultado){
            System.out.println("Has acertado");
        }else{
            System.out.println("No has acertado");
        
        }
    
    
    
 }
}
