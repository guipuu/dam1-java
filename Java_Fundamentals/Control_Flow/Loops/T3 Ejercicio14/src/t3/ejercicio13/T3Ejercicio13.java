/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio13;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    int numero;
        System.out.print("¿Hasta que numero quieres contar: ");
    numero=sc.nextInt();
    
        if(numero>0){
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }else{
            for (int i=1;i>=numero; i=i-1) {
                System.out.println(i);
            }
            
        }
        
        
    }
    
}
