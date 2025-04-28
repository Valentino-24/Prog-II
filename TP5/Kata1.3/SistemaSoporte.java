import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private static List<TicketSoporte> tickets = new ArrayList<>();
    private static int contadorTickets = 0;

    public static TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        TicketSoporte ticket = new TicketSoporte(++contadorTickets, descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    public static void asignarTecnico(TicketSoporte ticket, Tecnico tecnico) {
        ticket.asignarTecnico(tecnico.toString());
    }

    public static void listarTickets(String filtroEstado) {
        System.out.println("\n=== Tickets " + filtroEstado.toUpperCase() + " ===");
        tickets.stream()
                .filter(t -> t.getEstado().equalsIgnoreCase(filtroEstado))
                .forEach(System.out::println);
    }

    public static void mostrarEstadisticas() {
        long abiertos = tickets.stream().filter(t -> t.getEstado().equals("Abierto")).count();
        long enProceso = tickets.stream().filter(t -> t.getEstado().equals("En proceso")).count();
        long cerrados = tickets.stream().filter(t -> t.getEstado().equals("Cerrado")).count();

        System.out.println("\n=== Estadísticas ===");
        System.out.printf("- Abiertos: %d\n- En proceso: %d\n- Cerrados: %d\nTotal: %d\n",
                abiertos, enProceso, cerrados, tickets.size());
    }
}