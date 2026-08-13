import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double precioFinal;
        double precioOriginal;
        double descuento;

        System.out.print("Precio original: ");
        precioOriginal = leer.nextDouble();

        System.out.print("Precio pagado: ");
        precioFinal = leer.nextDouble();

        descuento = ((precioOriginal - precioFinal) / precioOriginal) * 100;

        System.out.println("Porcentaje de descuento: " + descuento + "%");

        leer.close();
    }
}