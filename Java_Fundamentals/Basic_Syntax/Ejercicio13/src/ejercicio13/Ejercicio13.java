/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables y el Scanner 
        int base,altura;
        double area;
        Scanner sc=new Scanner(System.in);
        
        //Pedimos la informacion
        System.out.println("Dime la base del triangulo: ");
        base=sc.nextInt();
        System.out.println("Dime la altura del triangulo: ");
        altura=sc.nextInt();
        
        //Calculos
        area=(base*altura)/2;
        
        //Damos la informacion
        System.out.println("El area es "+area+"cm");
        
    }
    
}
