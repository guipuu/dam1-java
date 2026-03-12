
import java.util.ArrayList;

public class AgenciaService {
    private ArrayList<Satelite> satelites;

    public AgenciaService(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }

    public void anadirSatelite(Satelite satelite) {
        satelites.add(satelite);
    }

    public boolean eliminarSatelite(String nombre) {
        for (int i = 0; i < satelites.size(); i++) {
            if (satelites.get(i).getNombre().equalsIgnoreCase(nombre)) {
                satelites.remove(i);
                return true;
            }
        }
        return false;
    }

    public Satelite buscarSatelite(String nombre) {
        for (Satelite s : satelites) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                return s;
            }
        }
        return null;
    }

    public void mostrarActivos() {
        boolean hayActivos = false;
        for (Satelite s : satelites) {
            if (s.isActivo()) {
                System.out.println(s);
                hayActivos = true;
            }
        }
        if (!hayActivos) System.out.println("No hay satélites activos en este momento.");
    }

    public void mostrarBateriaBaja(double porcentajeMaximo) {
        boolean encontrados = false;
        for (Satelite s : satelites) {
            if (s.getBateriaPorcentaje() < porcentajeMaximo) {
                System.out.println(s);
                encontrados = true;
            }
        }
        if (!encontrados) System.out.println("Ningún satélite está por debajo del " + porcentajeMaximo + "% de batería.");
    }

    public double calcularVelocidadMedia() {
        if (satelites.isEmpty()) return 0;
        double suma = 0;
        for (Satelite s : satelites) {
            suma += s.getVelocidadOrbital();
        }
        return suma / satelites.size();
    }

    public Satelite obtenerMenorBateria() {
        if (satelites.isEmpty()) return null;
        Satelite menor = satelites.get(0);
        for (Satelite s : satelites) {
            if (s.getBateriaPorcentaje() < menor.getBateriaPorcentaje()) {
                menor = s;
            }
        }
        return menor;
    }

    public boolean hayRiesgoReentrada() {
        for (Satelite s : satelites) {
            if (s.getAlturaOrbita() < 300) {
                return true;
            }
        }
        return false;
    }

    public String generarInformeGlobal() {
        if (satelites.isEmpty()) return "No hay satélites registrados para generar un informe.";

        int total = satelites.size();
        int activos = 0;
        double sumaBateria = 0;
        Satelite masRapido = satelites.get(0);
        Satelite masCercano = satelites.get(0);

        for (Satelite s : satelites) {
            if (s.isActivo()) activos++;
            sumaBateria += s.getBateriaPorcentaje();
            
            if (s.getVelocidadOrbital() > masRapido.getVelocidadOrbital()) masRapido = s;
            if (s.getAlturaOrbita() < masCercano.getAlturaOrbita()) masCercano = s;
        }

        double bateriaMedia = sumaBateria / total;

        return String.format(
            "--- INFORME GLOBAL AETO ---\n" +
            "Total de satélites: %d\n" +
            "Satélites activos: %d\n" +
            "Energía media disponible: %.2f%%\n" +
            "Satélite más rápido: %s (%.2f km/s)\n" +
            "Satélite más cercano (menor órbita): %s (%.2f km)",
            total, activos, bateriaMedia, 
            masRapido.getNombre(), masRapido.getVelocidadOrbital(),
            masCercano.getNombre(), masCercano.getAlturaOrbita()
        );
    }
}