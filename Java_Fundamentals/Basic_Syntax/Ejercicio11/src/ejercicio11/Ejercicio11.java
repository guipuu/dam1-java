/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author unai.rechis
 */
public class Ejercicio11 {
    /**
     * @param args the command line arguments
     */   
/**
* Un frutero necesita calcular los beneficios anuales que obtiene de la
venta de manzanas y peras. Por este motivo, es necesario diseñar una aplicación
que solicite las ventas (en kilos) de cada semestre para cada fruta. La aplicación
mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado
en 2,35 ? y el kilo de peras en 1,95 ? .
     * */
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Estas son las variables principales    
        int manz1,manz2,per1,per2,manzanast,perast;
        double preciom,preciop,beneficio;
        
        //Creamos los escaners de las ventas
        Scanner num6=new Scanner(System.in);
        
        //Pedimos al usuario que nos diga los kilos de manzanas que ha vendido en los dos semestres
        System.out.println("Kg de manzanas vendididas en el primer trimestre: ");
        manz1=num6.nextInt();
        System.out.println("Kg de manzanas vendidas en el segundo trimestre: ");
        manz2=num6.nextInt();
        //Logica del programa 
        manzanast=(manz2+manz1);
        preciom=manzanast*2.35;
        
        //Lo mismo con las peras 
        System.out.println("Kg de peras vendididas en el primer trimestre: ");
        per1=num6.nextInt();
        System.out.println("Kg de peras vendidas en el segundo trimestre: ");
        per2=num6.nextInt();
        //Logica del programa 
        perast=per1+per2;
        preciop=perast*1.95;
        
        //Ahora el beneficio total 
        beneficio=preciop+preciom;
        System.out.println("El beneficio total es de "+beneficio+"?");
        System.out.println("Por separado es "+preciom+"? de las manzanas y de las peras "+preciop+"?");
        num6.close();
    }
}
