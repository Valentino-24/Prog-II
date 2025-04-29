import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Franco Mastantuono", "Argentina", LocalDate.of(1980, 5, 10));
        Autor autor2 = new Autor("Sebastian Driussi", "Argentina", LocalDate.of(1975, 8, 20));

        Direccion direccion = new Direccion("Avellaneda", 123, "Mendoza", "5555");
        Editorial editorial = new Editorial("River", "www.riverplate.com", direccion);

        Genero genero = new Genero("Accion", "Duendes");

        Libro libro = new Libro("12340", "Lel", 2023, genero, editorial);
        libro.agregarAutor(autor1);
        libro.agregarAutor(autor2);

        Ejemplar ejemplar1 = new Ejemplar("Man", EstadoEjemplar.DISPONIBLE, libro);
        Ejemplar ejemplar2 = new Ejemplar("Nam", EstadoEjemplar.DISPONIBLE, libro);
        libro.agregarEjemplar(ejemplar1);
        libro.agregarEjemplar(ejemplar2);

        Revista revista = new Revista("Quantum Fracture", 2024, genero, 5, 12);
        Ejemplar ejemplarRevista = new Ejemplar("AAAAA", EstadoEjemplar.DISPONIBLE, revista);
        revista.agregarEjemplar(ejemplarRevista);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarPublicacion(libro);
        biblioteca.agregarPublicacion(revista);

        Usuario usuario = new Usuario("Ignacio", "Fernandez", "12345678");
        Prestamo prestamo = new Prestamo(LocalDate.of(2000,3,3), LocalDate.of(2000,4,4));
        prestamo.agregarLineaPrestamo(ejemplar1);
        usuario.agregarPrestamo(prestamo);

        biblioteca.agregarUsuario(usuario);

        System.out.println("Historial de Préstamos del Usuario:");
        usuario.mostrarHistorialPrestamos();
    }
}