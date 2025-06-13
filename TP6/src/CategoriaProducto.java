public enum CategoriaProducto {
    ALIMENTOS("Productos Consumibles"),
    ELECTRONICA("Apartos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Muebles");
    private final String descripcion;
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}

