public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(912, "Franco Mastantuono", "nuevedoce@example.com");
        TicketSoporte ticket1 = new TicketSoporte(1, "Error 404", usuario);
        TicketSoporte ticket2 = new TicketSoporte(2, "Pantalla azul");

        ticket1.asignarTecnico("Enzo Pérez");
        System.out.println(ticket1.mostrarDetalle());
        System.out.println(ticket2.mostrarDetalle());
    }
}