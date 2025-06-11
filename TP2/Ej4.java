import java.util.Scanner;
public class Ej4 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextInt();
        System.out.println("Ingrese la categoría del producto(A, B o C): ");
        String cate = scanner.next();
        double precioFinal = 0;
        if (cate.equals("A") || cate.equals("a")){
            precioFinal=precio-(precio * 0.1);
            System.out.println("Descuento aplicado: 10%");
        } else if (cate.equals("B") || cate.equals("b")){
            precioFinal=precio-(precio * 0.15);
            System.out.println("Descuento aplicado: 15%");
        } else if (cate.equals("C") || cate.equals("c")){
            precioFinal=precio-(precio * 0.2);
            System.out.println("Descuento aplicado: 20%");
        }else{
            System.out.println("Cátegoria no válida");
            precioFinal=precio;
        }
        System.out.println("Precio final: "+precioFinal);
    }
}