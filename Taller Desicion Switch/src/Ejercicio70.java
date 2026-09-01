import java.util.Scanner;

public class Ejercicio70 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double max, min;
        double sumaMax = 0;
        double sumaMin = 0;

        int dias = 0;
        int errores = 0;

        do {

            System.out.println("Temperatura maxima:");
            max = sc.nextDouble();

            System.out.println("Temperatura minima:");
            min = sc.nextDouble();

            if (max != 0 || min != 0) {

                dias++;

                if (max < 14 || max > 30 || min < 14 || min > 30) {
                    errores++;
                } else {
                    sumaMax = sumaMax + max;
                    sumaMin = sumaMin + min;
                }
            }

        } while (max != 0 || min != 0);

        System.out.println("Numero de dias: " + dias);
        System.out.println("Errores: " + errores);

        if (dias > 0) {
            System.out.println("Porcentaje de errores: "
                    + errores * 100.0 / dias + "%");
        }

        System.out.println("Media maxima: " + sumaMax / (dias - errores));
        System.out.println("Media minima: " + sumaMin / (dias - errores));
    }
}