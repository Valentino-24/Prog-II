import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String description;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnico;

    public TicketSoporte(int id, String description) {
        this(id, description, null);
    }

    public TicketSoporte(int id, String description, Usuario usuario) {
        this.id = id;
        this.description = description;
        this.usuario = usuario;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public void asignarTecnico(String tecnico) {
        this.tecnico = tecnico;
        this.estado = "En proceso";
    }

    public int getId() { return id; }
    public String getEstado() { return estado; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        String userInfo = (usuario != null) ? "Reportado por: " + usuario.getNombre() : "Sin usuario asignado";
        String techInfo = (tecnico != null) ? "\nTécnico: " + tecnico : "";
        return String.format(
                "[Ticket #%d]\n- Descripción: %s\n- Estado: %s\n- %s%s\n- Fecha: %s",
                id, description, estado, userInfo, techInfo, fechaCreacion
        );
    }
}
