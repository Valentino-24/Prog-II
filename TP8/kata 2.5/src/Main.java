import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String nombreArchivo = "kata2-5.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }
        } catch (IOException e) {
                    System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}