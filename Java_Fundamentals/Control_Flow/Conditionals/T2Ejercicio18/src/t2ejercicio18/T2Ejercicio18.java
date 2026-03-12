/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio18;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    float numero;
    int opcion;
        System.out.println("Dime un numero");
        numero=sc.nextFloat();
    
        System.out.print("Elige que quieres hacer con el \n"
                 +"1. Calcular la raiz cuadrada \n"
                + "2. Redondear hacia arriba \n"
                + "3. Redondear hacia abajo \n"
                + "4. Calcular el logaritmo\n"
                + "Elige una opcion: ");
        opcion=sc.nextInt();
        
        if(opcion>4||opcion<0){
            System.out.println("No has introducido ninguna opcion");
        }else{
            switch(opcion){
                case 1:
                    if(numero<0){
                    System.out.println("La raiz cuadrada es "+Math.sqrt(numero));
                    }else{System.out.println("No se puede");}
                    break;
                case 2:
                    System.out.println("Redondeado hacia arriba es "+Math.ceil(numero));
                    break;
                case 3:
                    System.out.println("Redondeado hacia abajo es "+Math.floor(numero));
                    break;
                case 4:
                    System.out.println("El logaritmo es "+Math.log(numero));
            }
        
        }
        
       
               
   
    
    
    
    
    
    
    
    }
    
}
