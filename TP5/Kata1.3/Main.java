public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(101, "Sebastían Driussi", "driussi@example.com");
        Usuario usuario2 = new Usuario(102, "Facundo Colidio", "facu@example.com");
        Tecnico tecnico1 = new Tecnico(201, "Miguel Borja", "Redes");
        Tecnico tecnico2 = new Tecnico(202, "Gonzalo Martínez", "Centros");

        TicketSoporte ticket1 = SistemaSoporte.crearTicket("Error al cargar página", usuario1);
        TicketSoporte ticket2 = SistemaSoporte.crearTicket("No hay conexión", usuario2);
        TicketSoporte ticket3 = SistemaSoporte.crearTicket("Desconocido", null);

        SistemaSoporte.asignarTecnico(ticket1, tecnico1);
        SistemaSoporte.asignarTecnico(ticket2, tecnico2);
        ticket3.cerrarTicket();

        SistemaSoporte.listarTickets("Abierto");
        SistemaSoporte.listarTickets("En proceso");
        SistemaSoporte.listarTickets("Cerrado");
        SistemaSoporte.mostrarEstadisticas();
    }
}