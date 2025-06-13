import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del archivo (con extensión): ");
        String nombreArchivo = scanner.nextLine();

        try {
            File archivo = new File(nombreArchivo);
            Scanner lectorArchivo = new Scanner(archivo);

            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();
                System.out.println(linea);
            }

            lectorArchivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo \"" + nombreArchivo + "\" no fue encontrado.");
        }
        finally {
            scanner.close();
            System.out.println("Fin de la lectura del archivo.");
        }
    }
}