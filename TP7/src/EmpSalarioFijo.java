public class EmpSalarioFijo extends Empleado {
    private final double sueldoFijo;
    static private final int añoActual = 2025;
    public EmpSalarioFijo(int DNI, String nombre, String apellido, int añoIngreso) {
        super(DNI, nombre, apellido, añoIngreso);
        this.sueldoFijo = 500000;
    }
    public double getSueldoFijo() {
        return sueldoFijo;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()+ "\nSueldo Fijo: " + sueldoFijo;
    }
    @Override
    public double mostrarSalario() {

        if(añoActual -this.getAñoIngreso() > 5) {
            return  1.1*this.getSueldoFijo();
        } else if (añoActual-this.getAñoIngreso()>2) {
            return  1.05*this.getSueldoFijo();
        }
        return this.getSueldoFijo();
    }
}