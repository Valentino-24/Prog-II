import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String description;
    private String estado;
    private LocalDate fechaCreacion;

    public TicketSoporte(int id, String description) {
        this.id = id;
        this.description = description;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public String mostrarDetalle() {
        return String.format(
                "Ticket #%d\nDescripción: %s\nEstado: %s\nFecha: %s",
                id, description, estado, fechaCreacion
        );
    }

    public int getId() { return id; }
    public String getEstado() { return estado; }
}
