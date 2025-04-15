public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    public void despegar(){
        if(combustible>10){
            System.out.println("¡La nave puede despegar!");
            combustible-=10;
        }else {
            System.out.println("La nave no puede despegar. Combustible insuficiente.");
        }
    }
    public void avanzar(int distancia){
        if (distancia<=combustible){
            System.out.println("Avanzando "+distancia+" unidades.");
            combustible-=distancia;
        }else {
            System.out.println("Combustible insuficiente, no se puede avanzar.");
        }
    }
    public void recargarCombustible(int cantidad){
        if (cantidad+combustible<=100){
            combustible+=cantidad;
            System.out.println("Combustible recargado.");
            System.out.println("Cantidad actual: "+combustible);
        }else {
            System.out.println("No se pueden superar las 100 unidades.");
        }
    }
    public void mostrarEstado(){
        System.out.println("Información de la nave:");
        System.out.println("Nombre: "+nombre);
        System.out.println("combustible actual: "+combustible);
    }

    public static void main(String[] args) {
        NaveEspacial naveEspacial = new NaveEspacial("EMP Starship",50);
        naveEspacial.despegar();
        naveEspacial.avanzar(60);
        naveEspacial.recargarCombustible(40);
        naveEspacial.avanzar(60);
        naveEspacial.mostrarEstado();
    }
}
