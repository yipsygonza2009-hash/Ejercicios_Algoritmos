import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double naranjas;
        double precioDocena;
        double venta;
        double costo;
        double ganancia;

        System.out.print("Cantidad de naranjas: ");
        naranjas = leer.nextDouble();

        System.out.print("Precio por docena: ");
        precioDocena = leer.nextDouble();

        System.out.print("Dinero obtenido: ");
        venta = leer.nextDouble();

        costo = (naranjas / 12) * precioDocena;

        ganancia = ((venta - costo) / costo) * 100;

        System.out.println("Ganancia: " + ganancia + "%");

        leer.close();
    }
}