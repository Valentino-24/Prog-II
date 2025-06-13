public class PayPal implements PagoConDescuento {
    private String email;
    private static double descuento = 0;
    public PayPal(String email) {
        this.email = email;
        this.descuento = descuento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago realizado con PayPal de $" + monto*(1-descuento));
    }
    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de " + porcentaje + "%");
        descuento = porcentaje/100;
    }
}
