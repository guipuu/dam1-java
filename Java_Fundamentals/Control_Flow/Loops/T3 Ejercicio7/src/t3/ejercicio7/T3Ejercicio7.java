/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio7;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
        int arbol=0,masalto=0,numcor=0,cod=0;
            
    while(arbol!=-1){
        System.out.println("Dime cm del arbol "+numcor+": ");
        arbol=sc.nextInt();
        if(arbol!=-1 && arbol>0){
        if(arbol>masalto){
            
            masalto=arbol;
            cod=numcor;
        }
        
        }
    
    numcor++;
    }
    
        System.out.println("El arbol mas alto mide "+masalto+" cm , tiene el codigo "+cod);
    }
    
}
