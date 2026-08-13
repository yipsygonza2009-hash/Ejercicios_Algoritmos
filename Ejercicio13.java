import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int b50000, b20000, b10000, b5000;
        int b2000, b1000, b500, b100;

        double total;

        System.out.print("Billetes de 50000: ");
        b50000 = leer.nextInt();

        System.out.print("Billetes de 20000: ");
        b20000 = leer.nextInt();

        System.out.print("Billetes de 10000: ");
        b10000 = leer.nextInt();

        System.out.print("Billetes de 5000: ");
        b5000 = leer.nextInt();

        System.out.print("Billetes de 2000: ");
        b2000 = leer.nextInt();

        System.out.print("Billetes de 1000: ");
        b1000 = leer.nextInt();

        System.out.print("Billetes de 500: ");
        b500 = leer.nextInt();

        System.out.print("Billetes de 100: ");
        b100 = leer.nextInt();

        total = (b50000 * 50000)
                + (b20000 * 20000)
                + (b10000 * 10000)
                + (b5000 * 5000)
                + (b2000 * 2000)
                + (b1000 * 1000)
                + (b500 * 500)
                + (b100 * 100);

        System.out.println("Total de dinero: $" + total);

        leer.close();
    }
}