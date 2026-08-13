import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double galones;
        double litros;
        double total;

        System.out.print("Ingrese los galones surtidos: ");
        galones = leer.nextDouble();

        litros = galones * 3.785;

        total = litros * 100;

        System.out.println("Litros: " + litros);
        System.out.println("Total a pagar: $" + total);

        leer.close();
    }
}