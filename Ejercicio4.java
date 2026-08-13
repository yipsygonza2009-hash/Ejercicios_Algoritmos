import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double compra;
        double descuento;
        double totalPagar;

        System.out.println("=== DESCUENTO EN UNA COMPRA ===");

        System.out.print("Ingrese el valor de la compra: ");
        compra = leer.nextDouble();

        descuento = compra * 0.15;
        totalPagar = compra - descuento;

        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        leer.close();
    }
}
    

