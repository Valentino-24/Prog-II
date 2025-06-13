public class TarjetaCredito implements PagoConDescuento{
    private String numeroTarjeta;
    private static double descuento = 0;
    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago realizado con Tarjeta de Credito de $" + monto*(1-descuento));
    }
    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de " + porcentaje + "%");
        descuento = porcentaje/100;
    }
}
