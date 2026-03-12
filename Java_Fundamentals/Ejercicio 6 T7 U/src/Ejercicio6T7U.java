
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6T7U {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Satelite> listaSatelites = new ArrayList<>();
        AgenciaService servicio = new AgenciaService(listaSatelites);
        
        servicio.anadirSatelite(new Satelite("AETO-Alfa", 400.5, 7.66, true, 85.0));
        servicio.anadirSatelite(new Satelite("AETO-Beta", 280.0, 7.80, true, 15.5)); 
        servicio.anadirSatelite(new Satelite("AETO-Gamma", 550.2, 7.50, false, 5.0));
        servicio.anadirSatelite(new Satelite("AETO-Delta", 450.0, 7.60, true, 92.0));

        int opcion;
        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- SATÉLITES ACTIVOS ---");
                    servicio.mostrarActivos();
                    break;
                case 2:
                    System.out.print("\nIntroduce el % de batería máximo a buscar: ");
                    double umbral = sc.nextDouble();
                    servicio.mostrarBateriaBaja(umbral);
                    break;
                case 3:
                    System.out.println("\n--- ANÁLISIS TÉCNICO ---");
                    System.out.printf("Velocidad orbital media: %.2f km/s\n", servicio.calcularVelocidadMedia());
                    Satelite menorBat = servicio.obtenerMenorBateria();
                    if (menorBat != null) {
                        System.out.println("Satélite con menor batería: " + menorBat.getNombre() + " (" + menorBat.getBateriaPorcentaje() + "%)");
                    }
                    if (servicio.hayRiesgoReentrada()) {
                        System.out.println("¡ALERTA! Hay riesgo de reentrada (órbita < 300 km).");
                    } else {
                        System.out.println("Sin riesgo de reentrada detectado.");
                    }
                    break;
                case 4:
                    anadirNuevoSatelite(servicio);
                    break;
                case 5:
                    System.out.print("\nIntroduce el nombre del satélite a eliminar: ");
                    String nombreEliminar = sc.next();
                    if (servicio.eliminarSatelite(nombreEliminar)) {
                        System.out.println("Satélite eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró ningún satélite con ese nombre.");
                    }
                    break;
                case 6:
                    System.out.print("\nIntroduce el nombre del satélite a buscar: ");
                    String nombreBuscar = sc.next();
                    Satelite encontrado = servicio.buscarSatelite(nombreBuscar);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("Satélite no encontrado.");
                    }
                    break;
                case 7:
                    System.out.println("\n" + servicio.generarInformeGlobal());
                    break;
                case 0:
                    System.out.println("Cerrando el sistema de la AETO. ¡Buen trabajo!");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
        
        sc.close();
    }

    private static int mostrarMenu() {
        while (true) {
            System.out.println("=== SISTEMA DE GESTIÓN AETO ===");
            System.out.println("1. Mostrar satélites activos");
            System.out.println("2. Mostrar satélites con batería baja");
            System.out.println("3. Ver análisis técnico rápido");
            System.out.println("4. Añadir nuevo satélite");
            System.out.println("5. Eliminar satélite");
            System.out.println("6. Buscar satélite");
            System.out.println("7. Generar informe global");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            
            if (sc.hasNextInt()) {
                int opcion = sc.nextInt();
                if (opcion >= 0 && opcion <= 7) {
                    return opcion;
                } else {
                    System.out.println("Error: Opción fuera de rango.\n");
                }
            } else {
                System.out.println("Error: Introduce un número válido.\n");
                sc.next();
            }
        }
    }

    private static void anadirNuevoSatelite(AgenciaService servicio) {
        System.out.println("\n--- AÑADIR SATÉLITE ---");
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Altura de órbita (km): ");
        double altura = sc.nextDouble();
        System.out.print("Velocidad orbital (km/s): ");
        double velocidad = sc.nextDouble();
        System.out.print("¿Está activo? (true/false): ");
        boolean activo = sc.nextBoolean();
        System.out.print("Batería restante (%): ");
        double bateria = sc.nextDouble();

        servicio.anadirSatelite(new Satelite(nombre, altura, velocidad, activo, bateria));
        System.out.println("Satélite añadido al sistema.");
    }
}