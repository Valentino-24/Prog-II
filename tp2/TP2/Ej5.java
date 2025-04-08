import java.util.Scanner;
public class Ej5 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un número(0 para terminar): ");
        int num=scanner.nextInt();
        int suma=0;
        while (num!=0){
            if (num%2==0) {
                suma+=num;
            }
            System.out.println("Ingrese un número(0 para terminar): ");
            num=scanner.nextInt();
        }
        System.out.println("La suma de los números pares es: "+suma);
    }
}