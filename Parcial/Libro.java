import java.util.ArrayList;
import java.util.List;

class Libro extends Publicacion {
    private String isbn;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String isbn, String titulo, int anio, Genero genero, Editorial editorial) {
        super(titulo, anio, genero);
        this.isbn = isbn;
        this.editorial = editorial;
        this.autores = new ArrayList<>();
    }

    public void agregarAutor(Autor a) {
        autores.add(a);
    }
}