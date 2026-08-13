import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double capital;
        double ganancia;
        double total;

        System.out.println("=== GANANCIA DE UNA INVERSIÓN ===");

        System.out.print("Ingrese el capital a invertir: ");
        capital = leer.nextDouble();

        ganancia = capital * 0.02;
        total = capital + ganancia;

        System.out.println("La ganancia después de un mes es: $" + ganancia);
        System.out.println("El dinero total después de un mes es: $" + total);

        leer.close();
    }
}