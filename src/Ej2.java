import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        int numMayor=0;
        if (num1>num2 && num1>num3){
            numMayor=num1;
        } else if (num2>num1&&num2>num3) {
            numMayor=num2;
        } else if (num3>num2&&num3>num1) {
            numMayor=num3;
        }else {
            System.out.println("Hay números iguales.");
        }
        System.out.println("Número mayor: "+numMayor);
    }
}