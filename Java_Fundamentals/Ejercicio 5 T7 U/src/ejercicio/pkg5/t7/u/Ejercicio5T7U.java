package ejercicio.pkg5.t7.u;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5T7U {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Estacion> listaEstaciones = new ArrayList<>();
        Servidor servidor = new Servidor(listaEstaciones);

        servidor.anadirEstacion(new Estacion("EST-001", 1500, 65.5, 12.0));
        servidor.anadirEstacion(new Estacion("EST-002", 250, 40.0, 5.5));
        servidor.anadirEstacion(new Estacion("EST-003", 2800, 105.2, 45.0)); 
        servidor.anadirEstacion(new Estacion("EST-004", 50, 80.0, 120.5));  
        servidor.anadirEstacion(new Estacion("EST-005", 1200, 55.0, 0.0));
        servidor.anadirEstacion(new Estacion("EST-006", 3200, 95.0, 80.0));

        int opcion;
        do {
            opcion = opciones(); 

            switch (opcion) {
                case 1:
                    System.out.println("\n--- AÑADIR ESTACIÓN ---");
                    System.out.print("ID de la estación: ");
                    String id = sc.next();
                    System.out.print("Altitud (m): ");
                    double altitud = sc.nextDouble();
                    System.out.print("Velocidad máxima del viento (km/h): ");
                    double viento = sc.nextDouble();
                    System.out.print("Precipitación total (mm): ");
                    double lluvia = sc.nextDouble();
                    
                    servidor.anadirEstacion(new Estacion(id, altitud, viento, lluvia));
                    System.out.println("¡Estación añadida correctamente!\n");
                    break;

                case 2:
                    System.out.println("\n--- FILTRAR POR ALTITUD ---");
                    System.out.print("Introduce la altitud mínima: ");
                    double altMin = sc.nextDouble();
                    servidor.mostrarEstacionesSobreAltitud(altMin);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\n--- MAYOR PRECIPITACIÓN ---");
                    Estacion maxLluvia = servidor.obtenerEstacionMayorPrecipitacion();
                    if (maxLluvia != null) {
                        System.out.println("La estación con más lluvia es: " + maxLluvia.getId() + " con " + maxLluvia.getPrecipitacion() + " mm\n");
                    } else {
                        System.out.println("No hay estaciones registradas.\n");
                    }
                    break;

                case 4:
                    System.out.println("\n--- ALERTA DE VIENTOS (>100 km/h) ---");
                    if (servidor.hayVientosHuracanados()) {
                        System.out.println("¡Alerta! Se han registrado vientos superiores a 100 km/h.\n");
                    } else {
                        System.out.println("Todo tranquilo. Ninguna estación superó los 100 km/h.\n");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema meteorológico... ¡Hasta pronto!");
                    break;
            }
        } while (opcion != 0);
        
        sc.close();
    }

    private static int opciones() {
        int opcion;
        while (true) {
            System.out.println("===MENU===");
            System.out.println("1. Añadir estacion");
            System.out.println("2. Mostrar estaciones > Altitud");
            System.out.println("3. Mayor precipitacion");
            System.out.println("4. Max valocidad 100KM/h");
            System.out.println("0. Salir");
            
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion >= 0 && opcion <= 4) {
                    return opcion;
                } else {
                    System.out.println("Error: Debe introducir un valor valido\n");
                }
            } else {
                System.out.println("Error: Debe introducir un numero entero\n");
                sc.next();
            }
        }
    }
}