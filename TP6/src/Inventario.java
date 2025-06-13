import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;
    private ArrayList<Producto> listaFiltrada;
    public Inventario() {
        productos = new ArrayList<>();
        listaFiltrada = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        this.productos.add(producto);
    }
    public void listarProductos() {
    for (Producto producto : productos) {
        System.out.println(producto.toString());
    }
    }

    public void buscarProductoPorId(String id){
        for (Producto producto : productos) {
            if (producto.getId().equals(id.toUpperCase())) {
                System.out.println("Producto encontrado");
                producto.mostrarInfo();
            }
        }
    }
    public void eliminarProducto(String id) {
        for (int i = productos.size() - 1; i >= 0; i--) {
            if (productos.get(i).getId().equals(id.toUpperCase())) {
                productos.remove(i);
            }
        }
    }
    public void actualizarStock(String id, int stock){
        for (Producto producto : productos) {
            if (producto.getId().equals(id.toUpperCase())) {
                producto.setCantidad(stock);
            }
        }
    }
    public void filtrarPorCategoria(CategoriaProducto categoria){
        System.out.println("Productos de la categoria " + categoria);
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                producto.mostrarInfo();
                this.listaFiltrada.add(producto);
            }
        }
    }
    public int obtenerTotalStock(){
        int stock = 0;
        for (Producto producto : productos) {
            stock = stock + producto.getCantidad();
        }
        return stock;
    }
    public void obtenerProductoConMayorStock() {
        int contador = 0;
        int contProd=0;
        int stockM=0;
        while (productos.size() > contador) {
            if (productos.get(contador).getCantidad()>stockM) {
                stockM=productos.get(contador).getCantidad();
                contProd=contador;
            }
            contador++;
        }
        System.out.println("El producto con mayor stock es: " + productos.get(contProd).getNombre());
    }
    public void filtrarProductosPorPrecio(double precioMin, double precioMax){
        System.out.println("Productos de ese rango de precios son ");
        this.listaFiltrada.clear();
        for (Producto producto : productos) {
            if (producto.getPrecio()>=precioMin && producto.getPrecio()<=precioMax) {
                producto.mostrarInfo();
                this.listaFiltrada.add(producto);
            }
        }
    }
    public void mostrarCategorias(){
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria.name() + " - " + categoria.getDescripcion());
        }
    }
}
