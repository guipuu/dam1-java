/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio10;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    int meta,ahorro,total=0,cont=0;
    
        System.out.println("Introduce tu meta de ahorro");
        meta=sc.nextInt();
    
    do{
        System.out.println("Dime lo que has ahorrado");
        ahorro=sc.nextInt();
        total=total+ahorro;
        if(ahorro==meta)System.out.println("Objetivo cumplido");       
        if(ahorro<meta)System.out.println("Sigue intentandolo");
        if(ahorro>meta)System.out.println("Te has pasasdo eres un experto");
    
    cont++;
    
    }while(meta>total);
        
        System.out.println("El numero de depositos fue : "+cont);
        
    }
    
}
