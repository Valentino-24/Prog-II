public class EmpComision extends Empleado {
    private final int salarioFijo;
    private int clientes;
    static final double comPorClientes = 50000.00;
    public EmpComision(int DNI, String nombre, String apellido, int añoIngreso, int clientes) {
        super(DNI, nombre, apellido, añoIngreso);
        this.salarioFijo = 400000;
        this.clientes = clientes;
    }
    public int getSalarioFijo() {
        return salarioFijo;
    }
    @Override
    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", salarioFijo=" + salarioFijo + ", clientes=" + clientes + "." ;
    }
    @Override
    public double mostrarSalario() {
        if (this.salarioFijo <= comPorClientes*this.clientes) {
            return comPorClientes*this.clientes;
        }else {
            return this.salarioFijo;
        }
    }
}