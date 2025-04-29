import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo p) {
        prestamos.add(p);
    }

    public void mostrarHistorialPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println("Préstamo: " + p.getFechaPrestamo() + " - Devolución: " + p.getFechaDevolucion());
            p.mostrarLineas();
        }
    }
}