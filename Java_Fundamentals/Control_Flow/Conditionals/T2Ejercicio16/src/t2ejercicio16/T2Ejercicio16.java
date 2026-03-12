/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio16;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int dia;
        
    System.out.println("Dime un numero del 1 al 7 ");        
    dia=sc.nextInt();
    
    if(dia<=0||dia>7){
        System.out.println("No vale ese numero");
    }else{
    switch(dia){
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;    
        case 7:
            System.out.println("Domingo");          
    }
    
    }
    
    
    
    
    }
    
}
