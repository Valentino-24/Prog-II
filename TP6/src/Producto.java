public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, CategoriaProducto categoria, String nombre, Double precio, int cantidad) {
        this.id = id.toUpperCase();
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println("Id: " + this.id + " Categoria: " + this.categoria + " Nombre: " + this.nombre + " Precio: " + this.precio+ " Cantidad: " + this.cantidad);
    }

    @Override
    public String toString() {
        return "Id:"+ this.id + " Categoria:" + this.categoria + " Nombre: " + this.nombre;
    }
}
