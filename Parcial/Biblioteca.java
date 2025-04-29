import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion p) {
        publicaciones.add(p);
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }
}