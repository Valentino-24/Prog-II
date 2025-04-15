import java.util.Objects;
import java.util.Scanner;
public class Ej9 {
    public static double calcularCostoEnvio(double peso, String zona){
        if (Objects.equals(zona, "Nacional")){
            return peso*5;
        } else if (Objects.equals(zona, "Internacional")) {
            return peso*10;
        } else {
            System.out.println("Zona no válida.");
            return 0;
        }
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto+costoEnvio;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del pruducto: ");
        double precioProducto=scanner.nextDouble();
        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();
        double costoEnvio = calcularCostoEnvio(peso,zona);
        double costeTotal = calcularTotalCompra(precioProducto,costoEnvio);
        System.out.println("El costo de envío es: "+costoEnvio);
        System.out.println("El coste total es de: "+costeTotal);
    }
}