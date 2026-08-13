import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double lecturaAnterior, lecturaActual;
        double costoKilovatio;
        double consumo, total;

        System.out.print("Lectura anterior: ");
        lecturaAnterior = leer.nextDouble();

        System.out.print("Lectura actual: ");
        lecturaActual = leer.nextDouble();

        System.out.print("Costo por kilovatio: ");
        costoKilovatio = leer.nextDouble();

        consumo = lecturaActual - lecturaAnterior;
        total = consumo * costoKilovatio;

        System.out.println("Consumo: " + consumo);
        System.out.println("Total a pagar: $" + total);

        leer.close();
    }
}