//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(Estado.PENDIENTE,new Cliente("Lica", "lica123@gmail,com"));
        pedido1.cambiarEstado(Estado.ENVIADO);
        pedido1.cambiarEstado(Estado.RECIBDO);
    }
}