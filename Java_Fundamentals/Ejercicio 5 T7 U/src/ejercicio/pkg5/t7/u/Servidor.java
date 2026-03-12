package ejercicio.pkg5.t7.u;

import java.util.List;

public class Servidor {
    private List<Estacion> estaciones;

    public Servidor(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public void anadirEstacion(Estacion est) {
        estaciones.add(est);
    }

    public void mostrarEstacionesSobreAltitud(double altitudMinima) {
        boolean encontrada = false;
        for (Estacion est : estaciones) {
            if (est.getAltura() > altitudMinima) {
                System.out.println(est);
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No hay ninguna estación por encima de " + altitudMinima + " metros.");
        }
    }

    public double calcularVelocidadMediaViento() {
        if (estaciones.isEmpty()) return 0;
        double sumaVientos = 0;
        for (Estacion est : estaciones) {
            sumaVientos += est.getMaxVelocidad();
        }
        return sumaVientos / estaciones.size();
    }

    public Estacion obtenerEstacionMayorPrecipitacion() {
        if (estaciones.isEmpty()) return null;
        Estacion maxEstacion = estaciones.get(0);
        for (Estacion est : estaciones) {
            if (est.getPrecipitacion() > maxEstacion.getPrecipitacion()) {
                maxEstacion = est;
            }
        }
        return maxEstacion;
    }

    public boolean hayVientosHuracanados() {
        for (Estacion est : estaciones) {
            if (est.getMaxVelocidad() > 100.0) {
                return true;
            }
        }
        return false;
    }
}