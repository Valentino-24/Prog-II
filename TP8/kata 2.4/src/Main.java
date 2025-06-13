import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        boolean entradaValida = false;

        while (!entradaValida) {

                System.out.print("Introduce tu edad: ");
                edad = Integer.parseInt(scanner.nextLine());

                if (edad < 0 || edad > 120) {
                    throw new EdadInvalidaException("Edad Invalidada: la edad debe estar entre 0 y 120");
                } else {
                    entradaValida = true;
                }
        }
    }
}