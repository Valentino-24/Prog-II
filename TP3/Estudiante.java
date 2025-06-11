public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double nota;
    public Estudiante(String nombre, String apellido, String curso, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.nota = nota;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Nota: " + nota);
    }
    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            nota += puntos;
            if (nota > 10) {
                nota = 10;
            }
        }
    }
    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            nota -= puntos;
            if (nota < 0) {
                nota = 0;
            }
        }
    }
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Valentino", "Lorca", "Programación", 8.5);
        System.out.println("Informacion inicial del estudiante: ");
        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1.5);
        System.out.println("\nDespués de subir la nota 1.5 puntos:");
        estudiante1.mostrarInfo();

        estudiante1.bajarCalificacion(5);
        System.out.println("\nDespués de bajar la nota 5 puntos:");
        estudiante1.mostrarInfo();

    }
}