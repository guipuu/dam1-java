/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    // Inicializa el lector para la entrada de datos
    Scanner numer = new Scanner(System.in);
    
    System.out.print("Dime un numero que sea par: ");
    int numero = numer.nextInt(); // Captura el número entero
    
    // El operador % obtiene el resto; si es 0, el número es par
    boolean parR = (numero % 2 == 0); 
    
    // Muestra si la condición se cumple (true o false)
    System.out.println("¿Es par? " + parR);
    }
    
}
