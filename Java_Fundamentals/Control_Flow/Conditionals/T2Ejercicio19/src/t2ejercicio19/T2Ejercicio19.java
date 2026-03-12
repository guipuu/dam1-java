/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2ejercicio19;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class T2Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    /** Crea un programa que le pida al usuario el día, mes y año de una fecha
     * y el programa debe indicar si la fecha es correcta o no. Hay que tener en cuenta que existen meses con 28,30 y 31 días.
     *  No se tienen en cuenta los años bisiestos. 
     */ 
        
    Scanner sc=new Scanner(System.in);
    int dia,mes,año;
    
        System.out.println("Dime el dia de hoy");
        dia=sc.nextInt();
        System.out.println("Dime el mes de hoy");
        mes=sc.nextInt();
        System.out.println("Dime el año actual");
        año=sc.nextInt();
        
        
        switch (mes){
            case 1:
                if(dia>0&&dia<=31){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 2:
                if(dia>0&&dia<=29){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 3:
                if(dia>0&&dia<=31){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 4:
                if(dia>0&&dia<=30){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 5:
                if(dia>0&&dia<=31){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 6:
                if(dia>0&&dia<=30){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 7:
                if(dia>0&&dia<=31){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 8:
                if(dia>0&&dia<=31){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 9:
                if(dia>0&&dia<=30){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 10:
                if(dia>0&&dia<=31){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 11:
                if(dia>0&&dia<=30){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}
            break;
            case 12:
                if(dia>0&&dia<=31){
                    System.out.println("Fecha correcta");
                }else{System.out.println("Fecha incorrecta");}                
            default :
                System.out.println("Fecha incorrecta");
        }
        
       
        
        
        
        
                
               
        
        
    }
    
}
