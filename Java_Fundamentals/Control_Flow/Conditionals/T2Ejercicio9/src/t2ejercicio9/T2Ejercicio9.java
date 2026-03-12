/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio9;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int edad;
    boolean hijoDeArtista,paseVip;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Dime tu edad");
    edad=sc.nextInt();
    System.out.println("Eres hijo de algun artista (true/false)");
    hijoDeArtista=sc.nextBoolean();
    System.out.println("Tienes pase vip (true/false)");
    paseVip=sc.nextBoolean();
    
    if(edad>=18&& paseVip || edad<18 && hijoDeArtista){
        System.out.println("Acceso permitido");
    }else{
        System.out.println("Acceso denegado");
    }
    
    
    
    
    
    
    
    }
    
    
    
}
