/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio8;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double nota ;
    Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nota ");
        nota=sc.nextDouble();
        
    if(nota>=0 && nota<=10){
        
    if(nota>=5){
        System.out.println("Enhorabuena has aprobado");
    }else{
        System.out.println("Venga tienes que seguir intenandolo");
    }
    }else{
        System.out.println("Nota invalida");
    }
    }
    
}
