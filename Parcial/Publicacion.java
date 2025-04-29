import java.util.*;
abstract class Publicacion {
    protected String titulo;
    protected int anio;
    protected List<Ejemplar> ejemplares;
    protected Genero genero;

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.ejemplares = new ArrayList<>();
    }

    public void agregarEjemplar(Ejemplar e) {
        ejemplares.add(e);
    }

    public List<Ejemplar> getEjemplaresDisponibles() {
        List<Ejemplar> disponibles = new ArrayList<>();
        for (Ejemplar e : ejemplares) {
            if (e.estaDisponible()) disponibles.add(e);
        }
        return disponibles;
    }
}