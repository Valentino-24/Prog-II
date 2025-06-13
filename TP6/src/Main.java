public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.listarProductos();
        Producto pizza1 = new Producto(
                "PIZZA1",
                CategoriaProducto.ALIMENTOS,
                "Prepizza",
                1800.00,
                10);
        Producto cel1 = new Producto(
                "cel1",
                CategoriaProducto.ELECTRONICA,
                "Telefono Motorola e40",
                120000.00,
                20);
        Producto Remera1 = new Producto(
                "REM1",
                CategoriaProducto.ROPA,
                "Remera Blanca",
                12000.00,
                50);
 // kata1
        inventario.añadirProducto(pizza1);
        inventario.añadirProducto(cel1);
        inventario.añadirProducto(Remera1);
        inventario.listarProductos();
//kata2
        inventario.buscarProductoPorId("PIZZA1");
        inventario.eliminarProducto("cel1");
        inventario.listarProductos();
        inventario.actualizarStock("PIZZA1", 108);
        inventario.buscarProductoPorId("PIZZA1");
        Producto pizza2 = new Producto("PIZZA2",CategoriaProducto.ALIMENTOS,"Prepizza 2",2000.00, 20);
        inventario.añadirProducto(pizza2);
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
//kata3
        Producto Espejo1 = new Producto("ESPMad1",CategoriaProducto.ALIMENTOS,"Espejo Borde Madera de Roble",26999.99, 100);
        inventario.añadirProducto(Espejo1);
        System.out.println("Total stock: " + inventario.obtenerTotalStock());
        inventario.obtenerProductoConMayorStock();
        inventario.filtrarProductosPorPrecio(1000,3000);
        inventario.mostrarCategorias();
    }
}