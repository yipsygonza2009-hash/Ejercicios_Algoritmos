import java.util.Scanner;
public class Ejerciicio58 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double capital, tasa, interes;
            int semanas, dias = 1;

            System.out.println("Ingrese el capital:");
            capital = sc.nextDouble();

            System.out.println("Ingrese la tasa de interes (%):");
            tasa = sc.nextDouble();

            System.out.println("Ingrese la cantidad de semanas:");
            semanas = sc.nextInt();

            tasa = tasa / 100;

            do {

                interes = capital * tasa / 365;
                capital = capital + interes;

                dias++;

            } while (dias <= semanas * 7);

            System.out.println("Capital acumulado: " + capital);
        }
    }

