import java.util.ArrayList;
public class Pedido {
    private ArrayList<Producto> productos;
    public Pedido() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    double calcularTotal(){
        double total = 0;
        for(Producto producto: this.productos){
            total+=producto.getPrecio();
        }
        return total;
    }
}
