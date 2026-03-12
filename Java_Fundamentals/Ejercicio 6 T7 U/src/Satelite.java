




public class Satelite {
    private String nombre;
    private double alturaOrbita;
    private double velocidadOrbital;
    private boolean activo;
    private double bateriaPorcentaje;

    public Satelite(String nombre, double alturaOrbita, double velocidadOrbital, boolean activo, double bateriaPorcentaje) {
        this.nombre = nombre;
        this.alturaOrbita = alturaOrbita;
        this.velocidadOrbital = velocidadOrbital;
        this.activo = activo;
        this.bateriaPorcentaje = bateriaPorcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAlturaOrbita() {
        return alturaOrbita;
    }

    public double getVelocidadOrbital() {
        return velocidadOrbital;
    }

    public boolean isActivo() {
        return activo;
    }

    public double getBateriaPorcentaje() {
        return bateriaPorcentaje;
    }

    @Override
    public String toString() {
        String estado = activo ? "Activo" : "Inactivo";
        return String.format("Satélite: %s | Altura: %.2f km | Velocidad: %.2f km/s | Estado: %s | Batería: %.2f%%",
                nombre, alturaOrbita, velocidadOrbital, estado, bateriaPorcentaje);
    }
}