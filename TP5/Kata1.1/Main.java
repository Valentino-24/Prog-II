public class Main {
    public static void main(String[] args) {
        TicketSoporte ticket = new TicketSoporte(1, "Error al iniciar sesión");
        System.out.println(ticket.mostrarDetalle()); // Estado: Abierto
        ticket.cerrarTicket();
        System.out.println(ticket.mostrarDetalle()); // Estado: Cerrado
    }
}