/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    int edadMax=1,edadMin=-1,edad=0;
    
        System.out.println("Introduce las edades de los alumnos: ");
        while(edad!=-1){
            System.out.print("Edad: ");
            edad=sc.nextInt();
            
            if(edad!=-1 && edad>0){
                if(edad>edadMax)edadMax=edad;
                if(edad<edadMin ||edadMin==-1)edadMin=edad;
            }
        
        }
        
        if(edadMax==-1||edadMin==-1){
            System.out.println("No has metido los valores correctos ");
        }else{
        System.out.println("Edad Maxima: "+edadMax);
        System.out.println("Edad Minima: "+edadMin);
        }
   
    
    }
    
}
