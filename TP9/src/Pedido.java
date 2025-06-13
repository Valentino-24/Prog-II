import java.time.LocalDate;
import java.util.ArrayList;


public class Pedido implements Comparable<Pedido>, Identificable<Integer> {

    private int id;
    private ArrayList<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(LocalDate fecha, int id) {
        this.fecha = fecha;
        this.id = id;
        this.productos = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean igualID(Integer otraId) {
        if (this.id == otraId) {
            return true;
        }else {return false;}

    }

    public ArrayList<Producto<?>> getProductos() {
        return productos;
    }

    public void agregarProducto (Producto<?> producto){
        productos.add(producto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }
    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" + "fecha=" + fecha +
                ", total $" + this.calcularTotal() +
                '}';
    }
}
