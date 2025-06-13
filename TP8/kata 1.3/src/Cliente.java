public class Cliente implements Notificable {
    private String nombre;
    private String email;
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificando al cliente: " + mensaje);
    }
}
