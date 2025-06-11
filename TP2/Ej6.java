import java.util.Scanner;
public class Ej6 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int impar=0;
        int par=0;
        int ceros=0;
        for (int i=1;i<=10;i++){
            System.out.println("Ingrese el número "+i+":");
            int num = scanner.nextInt();
            if (num==0){
                ceros++;
            } else if (num%2==0) {
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Pares: "+par);
        System.out.println("Impares: "+impar);
        System.out.println("Ceros: "+ceros);
    }
}