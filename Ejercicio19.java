import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double presupuesto;

        System.out.print("Ingrese el presupuesto anual: ");
        presupuesto = leer.nextDouble();

        System.out.println("Ginecología: $" + (presupuesto * 0.40));
        System.out.println("Traumatología: $" + (presupuesto * 0.30));
        System.out.println("Pediatría: $" + (presupuesto * 0.30));

        leer.close();
    }
}