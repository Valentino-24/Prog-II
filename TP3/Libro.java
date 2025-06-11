public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio >= 1900 && nuevoAnio <= 2025){
            this.anioPublicacion = nuevoAnio;
            System.out.println("Año cambiado correctamente.");
        } else {
            System.out.println(": No se puede modificar si el año es menor a 1900 o mayor al año actual.");
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell", 1930);

        libro1.setAnioPublicacion(1200);
        libro1.setAnioPublicacion(1949);
        System.out.println("Libro informacion:");
        System.out.println("Título: "+libro1.getTitulo());
        System.out.println("Autor: "+libro1.getAutor());
        System.out.println("Año de publicación: "+libro1.getAnioPublicacion());
    }
}
