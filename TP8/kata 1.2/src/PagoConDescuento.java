public interface PagoConDescuento extends Pago {
    default void aplicarDescuento(double porcentaje){
        System.out.println("Aplicando descuento de " + porcentaje + "% al monto del pago");
    }
}
