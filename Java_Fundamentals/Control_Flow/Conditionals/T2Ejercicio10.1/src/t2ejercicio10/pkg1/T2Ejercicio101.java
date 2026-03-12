/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio10.pkg1;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int numero, absoluto;
    
        System.out.println("Dime tu numero");
        numero=sc.nextInt();
        
        //El valor absoluto es el numero positivo de un real 
        
        
        int negativo= numero<0 ? -1:1;
        
        absoluto=numero*negativo;
        
        System.out.println("El valor ABSOLUTO es : "+absoluto);
    }
    
}
