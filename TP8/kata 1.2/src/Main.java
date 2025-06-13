public class Main {
    public static void main(String[] args) {
        PayPal cuenta1 = new PayPal("lukita@gmail.com");
        cuenta1.procesarPago(1000);
        cuenta1.aplicarDescuento(15);
        cuenta1.procesarPago(1000);
        TarjetaCredito tarjeta1 = new TarjetaCredito("123456789");
        tarjeta1.procesarPago(1000);
        tarjeta1.aplicarDescuento(30);
        tarjeta1.procesarPago(1000);
    }
}