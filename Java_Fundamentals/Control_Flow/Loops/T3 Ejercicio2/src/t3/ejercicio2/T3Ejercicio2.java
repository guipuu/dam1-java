/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio2;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner (System.in);
    int ini,fin,cont;
        System.out.print("Dime el contador de inicio: ");
        ini=sc.nextInt();
        System.out.print("Dime el contador final : ");
        fin=sc.nextInt();
        cont=0;
        
        if(ini>fin){
            System.out.println("No se puede el conmtador de inicio es mayor al de fin");
        }else{
        while(ini<fin-1){
            ini++;
            System.out.println(ini);
            cont++;            
        }
            System.out.println("Se han mostrado "+cont);
        }
    }    
}

