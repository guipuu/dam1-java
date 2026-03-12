/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio5;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
     // TODO code application logic here
      Scanner sc=new Scanner(System.in);
      
      int edad=0,total=0;
      float media;
      final int EdadMax=18;
      int contm=0 , contedad=0;
              
      while(edad>=0){
          System.out.print("Dime la edad: ");
          edad=sc.nextInt();   
          if(edad>=0){
          total=total+edad;
          }
          if(edad>=EdadMax)contm++; 
          if(edad>=0)contedad++;
      }
      
      media=total/3;
      System.out.println("---DATOS---");
      System.out.println("El total es "+total);
      System.out.printf("La media es : %.2f%n",media);//%.2f dos decimales y %n es igual a \n
      System.out.println("Mayores de edad: "+contm);
      System.out.println("El total de alumnos es: "+contedad);
    
    
    
  }    
}
