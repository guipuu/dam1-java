/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio14;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int numero;
    final int MAXIMO=99999;
    final int MINIMO=0;
        System.out.println("Dime un numero del 0 al 99999");
        numero=sc.nextInt();
    
    if(numero>MAXIMO || numero<MINIMO){
        System.out.println("Numero no valido");
    }else if(numero>9999){
        System.out.println("Tiene 5 cifras");
    }else if(numero>999){
        System.out.println("Tiene 4 cifras");
    }else if(numero>99){
        System.out.println("Tiene 3 cifras");
    }else if(numero>9){
        System.out.println("Tiene 2 cifras");
    }else{
        System.out.println("Tiene una cifra");
    }
    
    
    }
    
    
    }
    

