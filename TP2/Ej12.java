import java.util.Scanner;
public class Ej12 {
    public static void main(String[] args) {
        double[] precios = {199.99,299.5,149.75,399,89.99};
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.print("\nPrecio: " + precio);
        }
        precios[2] = 129.99;
        System.out.println("\n\nPrecios modificados:");
        for (double precio : precios) {
            System.out.print("\nPrecio: " + precio);
        }
    }
}