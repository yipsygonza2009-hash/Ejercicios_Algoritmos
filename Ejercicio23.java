import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int harina;
        int aceite;

        double b1, b2, b3, b4;

        int bultos;
        int cajas;

        double ingreso;

        System.out.print("Kg de harina: ");
        harina = leer.nextInt();

        System.out.print("Litros de aceite: ");
        aceite = leer.nextInt();

        System.out.print("Precio bulto harina: ");
        b1 = leer.nextDouble();

        System.out.print("Precio caja aceite: ");
        b2 = leer.nextDouble();

        System.out.print("Precio kg harina: ");
        b3 = leer.nextDouble();

        System.out.print("Precio litro aceite: ");
        b4 = leer.nextDouble();

        bultos = harina / 24;
        cajas = aceite / 15;

        ingreso = (bultos * b1)
                + ((harina % 24) * b3)
                + (cajas * b2)
                + ((aceite % 15) * b4);

        System.out.println("Ingreso total: $" + ingreso);

        leer.close();
    }
}