import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double capital;
        double interes;
        double razon;

        System.out.print("Capital: ");
        capital = leer.nextDouble();

        System.out.print("Intereses pagados: ");
        interes = leer.nextDouble();

        razon = (interes * 100) / (capital * 4);

        System.out.println("Porcentaje anual: " + razon + "%");

        leer.close();
    }
}