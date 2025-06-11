public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    public void ponerHuevo(){this.huevosPuestos++;}
    public void envejecer(){
        this.edad++;
    }
    public void mostrarEstado(){
        System.out.println("Id: "+this.idGallina);
        System.out.println("Edad: "+this.edad);
        System.out.println("Huevos Puestos: "+this.huevosPuestos);
    }

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1,4,0);
        Gallina gallina2 = new Gallina(2,6,0);
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
