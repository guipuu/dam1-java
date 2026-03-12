package ejercicio.pkg5.t7.u;

public class Estacion {

    private String id;
    private double altura;
    private double maxVelocidad; 
    private double precipitacionTotalmm; 

    public Estacion(String id, double altitud, double velocidadVientoMax, double precipitacionAcumulada) {
        this.id = id;
        this.altura = altitud;
        this.maxVelocidad = velocidadVientoMax;
        this.precipitacionTotalmm = precipitacionAcumulada;
    }

    public String getId() {
        return id;
    }

    public double getAltura() {
        return altura;
    }

    public double getMaxVelocidad() {
        return maxVelocidad;
    }

    public double getPrecipitacion() {
        return precipitacionTotalmm;
    }

    @Override
    public String toString() {
        return String.format("Estación ID: %s | Altitud: %.2f m | Viento Max: %.2f km/h | Precipitación: %.2f mm",
                id, altura, maxVelocidad, precipitacionTotalmm);
    }
}