import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año para saber si es bisiesto: ");
        int anio = scanner.nextInt();
        boolean esBisiesto;
        if ((anio % 4==0 && anio % 100 != 0) || anio % 400 == 0){
            esBisiesto = true;
        }else{
            esBisiesto = false;
        }
        if(esBisiesto){
          System.out.println(anio+" es bisiesto.");
        }else {
            System.out.println(anio+" no es bisiesto");
        }
    }
}