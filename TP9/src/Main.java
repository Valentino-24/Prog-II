import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Producto papa = new Producto<String>("papa1", 100.00, "Papa" );
        Producto leche = new Producto<Integer>(1, 200.00, "Leche" );
        Carrito carrito = new Carrito();
        carrito.agregarProducto(papa);
        carrito.agregarProducto(leche);
        carrito.agregarProducto(leche);
        carrito.mostrarProductos();
        System.out.println("Total carrito: $" + carrito.obtenerTotal());;
        Pedido pedido1 = new Pedido(LocalDate.of(2023,7,12),1);
        Pedido pedido2 = new Pedido(LocalDate.of(2017,1,8),2);
        Pedido pedido3 = new Pedido(LocalDate.of(2018,9,12),3);
        pedido1.agregarProducto(leche);
        pedido2.agregarProducto(papa);
        pedido3.agregarProducto(leche);
        pedido1.agregarProducto(papa);
        ArrayList<Pedido> Pedidos = new ArrayList<>();

        Pedidos.add(pedido1);
        Pedidos.add(pedido2);
        Pedidos.add(pedido3);
        System.out.println("pedidos añadidos");
        for (Pedido p : Pedidos) {
            System.out.println(p.toString());
        }
        Collections.sort(Pedidos);
        System.out.println("Total");
        for (Pedido p : Pedidos) {
            System.out.println(p.toString());
        }
        System.out.println("fecha");
        Collections.sort(Pedidos,new ComparadorPedidosPorFecha());
        for (Pedido p : Pedidos) {
            System.out.println(p.toString());
        }
        // kata 4
        Buscador<Pedido, Integer> buscadorPedidoId = new Buscador<>();
        System.out.println("Pedido Buscado: " + buscadorPedidoId.buscar(Pedidos,2));

    }
}