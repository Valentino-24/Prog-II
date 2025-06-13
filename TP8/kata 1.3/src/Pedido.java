public class Pedido {
    private Cliente cliente;
    private Estado estado;

    public Pedido(Estado estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void cambiarEstado(Estado estado){
        this.estado = estado;
        this.cliente.notificar("El estado del Pedido a Cambiado a " + estado);
    }


}
