import java.util.Scanner;

public class Ejercicio66 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pasajeros;
        int pasajero = 1;

        double peso;
        double tarifa;
        double totalPagar;
        double totalPeso;

        System.out.println("Ingrese la cantidad de pasajeros:");
        pasajeros = sc.nextInt();

        do {

            totalPagar = 0;
            totalPeso = 0;

            System.out.println("\nPasajero " + pasajero);

            System.out.println("Ingrese la cantidad de maletas:");
            int maletas = sc.nextInt();

            int maleta = 1;

            do {

                System.out.println("Peso de la maleta " + maleta + " en kg:");
                peso = sc.nextDouble();

                if (peso <= 3)
                    tarifa = 0;
                else if (peso <= 6)
                    tarifa = 600;
                else if (peso <= 9)
                    tarifa = 1200;
                else if (peso <= 12)
                    tarifa = 1500;
                else if (peso <= 15)
                    tarifa = 2000;
                else
                    tarifa = 2500;

                totalPeso = totalPeso + peso;
                totalPagar = totalPagar + tarifa;

                System.out.println("Tarifa de la maleta: $" + tarifa);

                maleta++;

            } while (maleta <= maletas);

            System.out.println("\nPeso total del equipaje: "
                    + totalPeso + " kg");

            System.out.println("Total a pagar: $"
                    + totalPagar);

            pasajero++;

        } while (pasajero <= pasajeros);
    }
}