package service;

import dao.CategoriaDAOImpl;
import model.Categoria;

import java.sql.Connection;
import java.util.List;

public class CategoriaServiceImpl {

    private CategoriaDAOImpl dao;

    public CategoriaServiceImpl(Connection conn) {
        this.dao = new CategoriaDAOImpl(conn);
    }

    public void crear(Categoria c) {
        if (c.getNombre() == null || c.getNombre().isEmpty()) {
            throw new IllegalArgumentException("Error");
        }
        dao.crear(c);
    }

    public Categoria leer(int id) {
        return dao.leer(id);
    }

    public void actualizar(Categoria c) {
        dao.actualizar(c);
    }

    public void eliminar(int id) {
        dao.eliminar(id);
    }

    public List<Categoria> listar() {
        return dao.listar();
    }
}
