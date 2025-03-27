import java.util.Scanner;
public class Ej7 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int nota=0;
        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota=scanner.nextInt();
            if(!(nota>0 && nota <=10)){
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        }while (!(nota>0 && nota <=10));
        System.out.println("Nota guardada correctamente.");
    }
}