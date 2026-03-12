/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio21;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /** Usando la estructura switch como expresión que devuelve un valor, 
     * haz un programa que le pida un número entre 1 y 12 al usuario.  
     * Estos números se corresponden con los meses del año (enero, febrero, marzo?). 
     * El programa devolverá por pantalla el número de días que tiene ese mes. 
     * (febrero=28)
     */
    
    int numero;
    Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 12 (el numero de mes)");
        numero=sc.nextInt();
        
        int dias = switch(numero){
            case 1,3,5,7,8,10,12 -> {yield 31;}
            case 2 -> {yield 28;}
            case 4,6,9,11 -> {yield 30;}
            default -> {yield 0;}
        };
        
        if(dias==0){
            System.out.println("No vallido");
        }else{
            System.out.println("Los dias son "+dias);
        }
        
    
    
    
    
    
    }
    
}
