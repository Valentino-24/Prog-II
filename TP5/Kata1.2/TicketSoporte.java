import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String description;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnico;

    public TicketSoporte(int id, String description,Usuario usuario) {
        this.id = id;
        this.description = description;
        this.usuario = usuario;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }
    public TicketSoporte(int id, String description) {
        this(id, description, null);
    }

    public void asignarTecnico(String tecnico) {
        this.tecnico = tecnico;
        this.estado = "En proceso";
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public String mostrarDetalle() {
        String detalleUsuario = (usuario != null) ? "\nUsuario: " + usuario.getNombre() : "";
        String detalleTecnico = (tecnico != null) ? "\nTécnico: " + tecnico : "";
        return String.format(
                "Ticket #%d%s\nDescripción: %s\nEstado: %s%s\nFecha: %s",
                id, detalleUsuario, description, estado, detalleTecnico, fechaCreacion
        );
    }

    public int getId() { return id; }
    public String getEstado() { return estado; }
}
