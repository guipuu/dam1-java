/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio11;
import java.util.Scanner;
/**
 * @author unai.rechis
 */
public class T3Ejercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);   
    int respuesta,cont=0;
    int ingrediente;
    float resultado=0;
    do{
        System.out.println("Elige los ingredientes de la pizza ");
        System.out.println("---INGREDIENRES---");
        System.out.println("1-QUESO---------2?");
        System.out.println("2-CHAMPIS-------4?");
        System.out.println("3-BACON---------1?");
        System.out.println("4-PEPERONI------1?");
        System.out.println("5-JAMON YORK--0,7?");
        System.out.println("6-HUEVO FRITO---2?");
        System.out.println("7-CEBOLLA CAR---2?");
        System.out.print("Elige ingredinete: ");
    ingrediente=sc.nextInt(); 
    switch(ingrediente){    
        case 1:
            System.out.println("QUESO");
            resultado=resultado+2;
        break;
        case 2:
            System.out.println("CHAMPIS");
            resultado=resultado+4;
        break;
        case 3:
            System.out.println("BACON");
            resultado=resultado+1;
        break;
        case 4:
            System.out.println("PEPERONI");
            resultado=resultado+1;
        break;
        case 5:
            System.out.println("JAMON YORK");
            resultado=(float)(resultado+0.7);
        break;
        case 6:
            System.out.println("HUEVO FRITO");
            resultado=resultado+2;
        break;
        case 7:  
            System.out.println("CEBOLLA CARAMELIZADA");
            resultado=resultado+2;
    }    
    cont++;    
        System.out.println("Quieres algun ingrediente mas : 1 (no) 0 (si)");
    respuesta=sc.nextInt();       
    }while(respuesta!=1);    
      if(cont>=2){
        System.out.println("Precio: "+resultado);
        System.out.println("Numero de ingredientes: "+cont);
        if(cont>5){
            System.out.println("?? Súper pizza");
        }else{
        if(cont>=3)System.out.println("? Completa");
        if(cont<3)System.out.println("? Sencilla");
        }
      }else {
          System.out.println("Necesitamas mas de 2 ingredientes");
      }
    }   
}
