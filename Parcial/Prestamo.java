import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private List<LineaPrestamo> lineas;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = new ArrayList<>();
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LineaPrestamo linea = new LineaPrestamo(ejemplar);
        lineas.add(linea);
        ejemplar.setEstado(EstadoEjemplar.PRESTADO);
    }

    public void mostrarLineas() {
        for (LineaPrestamo lp : lineas) {
            System.out.println("  Ejemplar: " + lp.getCodigoEjemplar());
        }
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
}