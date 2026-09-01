import java.util.Scanner;
public class Ejercicio56 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int dividendo;
            int divisor;
            int cociente = 0;
            int residuo;

            System.out.println("Ingrese el dividendo:");
            dividendo = sc.nextInt();

            System.out.println("Ingrese el divisor:");
            divisor = sc.nextInt();

            do {

                dividendo = dividendo - divisor;
                cociente++;

            } while (dividendo >= divisor);

            residuo = dividendo;

            System.out.println("Cociente: " + cociente);
            System.out.println("Residuo: " + residuo);
        }
    }

