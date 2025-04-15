import java.util.Scanner;
public class Ej3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad=scanner.nextInt();
        if (edad<12&&edad>0){
            System.out.println("Eres un niño.");
        } else if (edad>=12 && edad<18) {
            System.out.println("Eres un adolescente.");
        } else if (edad>=18&&edad<60) {
            System.out.println("Eres un adulto.");            
        } else if (edad>=60) {
            System.out.println("Eres un adulto mayor.");
        }else {
            System.out.println("Edad no válida.");
        }
    }
}