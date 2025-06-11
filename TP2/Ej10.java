import java.util.Scanner;
public class Ej10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual-cantidadVendida+cantidadRecibida;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        int nuevoStock = actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
        System.out.println("El nuevo stock del producto es de: "+nuevoStock);

    }
}