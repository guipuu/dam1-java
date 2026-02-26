/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioo12;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class Ejercicioo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variable 
        int segundos,horas,minutos,s;
        Scanner sc=new Scanner(System.in);
        
        //Pedimos la informacion
        System.out.println("Pon segundos: ");
        segundos=sc.nextInt();
        
        //Calculamos
        horas=segundos/3600;
        minutos=segundos%3600/60;
        s=segundos%60;
        
        
        //Damos la informacion 
        System.out.println("Son "+horas+"h "+minutos+"min "+s+"s ");
    }
    
}
