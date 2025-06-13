public class Producto<T> {

    private T id;
    private String nombre;
    private double precio;

    public Producto(T id, double precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }

    public T getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }
}
