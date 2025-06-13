public abstract class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private int añoIngreso;

    public Empleado(int DNI, String nombre, String apellido, int añoIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public int getClientes(){
        return 0;
    }

    public String mostrarInfo() {
        return "Empleado:" + "DNI=" + DNI + ", nombre='" + nombre + ", apellido='" + apellido + ", añoIngreso=" + añoIngreso ;
    }
    public abstract double mostrarSalario();
}
