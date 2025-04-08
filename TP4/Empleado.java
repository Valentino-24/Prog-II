public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constructores
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, 1000.0); // ID automático y salario por defecto
    }
    
    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }
    
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "ID: " + id + 
               "\nNombre: " + nombre + 
               "\nPuesto: " + puesto + 
               "\nSalario: $" + String.format("%.2f", salario) + 
               "\n---------------------";
    }
    
    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}