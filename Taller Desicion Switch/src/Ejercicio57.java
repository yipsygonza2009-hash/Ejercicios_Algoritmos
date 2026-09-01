import java.util.Scanner;
public class Ejercicio57 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double n;
            double x = 0.1;
            double rn;
            double diferencia;

            System.out.println("Ingrese un numero positivo:");
            n = sc.nextDouble();

            do {

                rn = (x + n / x) / 2;

                diferencia = x - rn;

                if (diferencia < 0) {
                    diferencia = diferencia * -1;
                }

                x = rn;

            } while (diferencia >= 0.000001);

            System.out.println("La raiz cuadrada es: " + rn);
        }
    }

