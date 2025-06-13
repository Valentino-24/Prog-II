import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número entero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 / numero2;
            System.out.println("Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }

        finally {
            scanner.close();
            System.out.println("Fin de la division.");
        }

    }
}