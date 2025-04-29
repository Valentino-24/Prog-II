import java.time.LocalDate;
class LineaPrestamo {
    private LocalDate fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
        this.fechaDevolucionEstimada = LocalDate.now().plusDays(14);
    }

    public String getCodigoEjemplar() {
        return ejemplar.getCodigo();
    }
}