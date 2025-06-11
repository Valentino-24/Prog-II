public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado(1, "Enzo Pérez", "Desarrollador", 1500.0);
        Empleado emp2 = new Empleado("Manuel Lanzini", "Diseñador");
        Empleado emp3 = new Empleado("Ignacio Fernandez", "Analista");
        
       
        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(200); 
    
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}