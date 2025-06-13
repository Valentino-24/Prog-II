import java.util.ArrayList;

public class Carrito<T extends Producto<?>> {
    private ArrayList<T> productos;

    public Carrito() {
        this.productos = new ArrayList<>() ;
    }

    public void agregarProducto(T producto) {
        this.productos.add(producto);
    }
    public void eliminarProducto(T producto) {
        this.productos.remove(producto);
    }
    public void mostrarProductos() {
        for (T producto : this.productos) {
            System.out.println(producto.toString());
        }
    }
    public double obtenerTotal() {
        double total = 0;
        for (T producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
