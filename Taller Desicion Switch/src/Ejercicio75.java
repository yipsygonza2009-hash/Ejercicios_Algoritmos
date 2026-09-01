import java.util.Scanner;

public class Ejercicio75 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int persona = 1;

        do {

            double suma = 0;
            double pesoAnterior;

            System.out.println("Peso de la ultima reunion:");
            pesoAnterior = sc.nextDouble();

            int bascula = 1;

            do {

                System.out.println("Peso en bascula " + bascula + ":");
                suma = suma + sc.nextDouble();

                bascula++;

            } while (bascula <= 10);

            double promedio = suma / 10;
            double diferencia = promedio - pesoAnterior;

            if (diferencia > 0)
                System.out.println("SUBIO " + diferencia + " kilos");
            else if (diferencia < 0)
                System.out.println("BAJO " + (-diferencia) + " kilos");
            else
                System.out.println("MANTUVO EL PESO");

            persona++;

        } while (persona <= 5);
    }
}