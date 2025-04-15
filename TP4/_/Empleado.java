public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
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
    
    @Override
    public String toString() {
        return "ID: " + id + 
               "\nNombre: " + nombre + 
               "\nPuesto: " + puesto + 
               "\nSalario: $" + String.format("%.2f", salario) + 
               "\n---------------------";
    }
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}