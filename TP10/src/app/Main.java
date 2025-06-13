package app;

import model.Categoria;
import service.CategoriaServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TP10";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            CategoriaServiceImpl service = new CategoriaServiceImpl(conn);

            Categoria cat = new Categoria(0, "Electrónica", "Dispositivos y gadgets");
            service.crear(cat);
            System.out.println("Categorías:");
            for (Categoria c : service.listar()) {
                System.out.println(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
