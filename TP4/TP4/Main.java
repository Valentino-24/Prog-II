public class Main {
    public static void main(String[] args) {
        // Crear empleados usando diferentes constructores
        Empleado emp1 = new Empleado(1, "Juan Pérez", "Desarrollador", 1500.0);
        Empleado emp2 = new Empleado("María García", "Diseñadora");
        Empleado emp3 = new Empleado("Carlos López", "Analista");
        
        // Actualizar salarios usando métodos sobrecargados
        emp1.actualizarSalario(10); // Aumento del 10%
        emp2.actualizarSalario(200); // Aumento fijo de 200
        
        // Mostrar información de los empleados
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        // Mostrar total de empleados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}