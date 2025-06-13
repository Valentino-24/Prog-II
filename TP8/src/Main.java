public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Papa", 1000);
        Producto producto2 = new Producto("Manzana", 100);

        System.out.println("precio " + producto1.calcularTotal());
        System.out.println("precio " + producto2.calcularTotal());

        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        System.out.println("precio " + pedido1.calcularTotal());
    }
}