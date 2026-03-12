/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio17;
import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    int heroe;
      System.out.println("Elige uno de estos super Heroes: \n 1.Spiderman    2.Batman \n 3.Wonder Woman 4.Iron Man");
        System.out.print("Elige el numero: ");
      heroe=sc.nextInt();
      
     if(heroe<0||heroe>4){
         System.out.println("No eres nada");
     }else{
        switch(heroe){
          case 1:
              System.out.println("¡Eres agil como Spiderman!");
          break;
          case 2:
              System.out.println("¡Eres sombrio como Batman!");
          break;
          case 3:
              System.out.println("¡Eres una gerrera de las amazonas!");
          break;
          case 4:
              System.out.println("¡Eres millonario como Iron Man!");   
        }
      }
    }
    
}
