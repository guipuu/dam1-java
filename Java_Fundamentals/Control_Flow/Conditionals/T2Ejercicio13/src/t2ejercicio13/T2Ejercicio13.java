/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio13;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    double a,b,c,x1,x2,discriminante;
    
        System.out.println("Dime a ");
        a=sc.nextDouble();
        System.out.println("Dime b ");
        b=sc.nextDouble();
        System.out.println("Dime c ");
        c=sc.nextDouble();
    
        discriminante=Math.pow(b,2)-4*a*c;
        
        if(a==0 || discriminante<0){
            System.out.println("NO SE PUEDE HACER");
        }else{
            x1=(-b + Math.sqrt(discriminante))/(2*a);
            x2=(-b - Math.sqrt(discriminante))/(2*a);

            System.out.println("X es igual a "+x1+" la otra solucion es "+x2);
        }
        
        
    
    
        
    
    }
    
}
