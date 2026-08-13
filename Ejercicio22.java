import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double contado;
        double cuota;
        double totalCuotas;
        double recargo;

        System.out.print("Precio de contado: ");
        contado = leer.nextDouble();

        System.out.print("Valor de cada cuota: ");
        cuota = leer.nextDouble();

        totalCuotas = cuota * 12;

        recargo = ((totalCuotas - contado) / contado) * 100;

        System.out.println("Porcentaje de recargo: " + recargo + "%");

        leer.close();
    }
}