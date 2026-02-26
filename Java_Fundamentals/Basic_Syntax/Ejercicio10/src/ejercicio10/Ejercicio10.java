/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// Inicializa el lector de teclado
        Scanner sc = new Scanner(System.in);

// Pedimos los datos al usuario (true/false)
        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean(); // Lee si llueve

        System.out.print("¿Has terminado tus tareas? (true/false): ");
        boolean tareasTerminadas = sc.nextBoolean(); // Lee estado de tareas

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean biblioteca = sc.nextBoolean(); // Lee si necesita biblioteca

// Lógica: sale si necesita biblioteca O (si no llueve Y terminó tareas)
        boolean permiso = biblioteca || (!llueve && tareasTerminadas);

// Muestra el resultado final
        System.out.println("¿Puedes salir a la calle?: " + permiso);
    }

}
