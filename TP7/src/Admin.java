import java.util.ArrayList;
public class Admin {
    public ArrayList<Empleado> empleados;

    public Admin() {
        empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }
    public void mostarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println("El empleado "+ empleado.getNombre() +" cobra: $" + empleado.mostrarSalario());
        }
    }
    public void obtenerEmpleadoConMasComisiones() {
        int contador = 0;
        int contEmp=0;
        int clientesM=0;
        while (empleados.size() > contador) {
            if (empleados.get(contador).getClientes()>clientesM) {
                clientesM=empleados.get(contador).getClientes();
                contEmp=contador;
            }
            contador++;
        }
        System.out.println("El empleado con mayores clientes es " + empleados.get(contEmp).getNombre()+ ", con "+empleados.get(contEmp).getClientes()+ " clientes.");
    }
}
