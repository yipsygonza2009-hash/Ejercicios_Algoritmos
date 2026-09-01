import java.util.Scanner;
public class Ejercicio54 {


public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cuestionario = 1;
        int pregunta;
        int respuesta;
        int total;
        double promedio;

        double sumaPromedios = 0;
        double mayor = 0;
        double menor = 5;

        int cuestionarioMayor = 0;
        int cuestionarioMenor = 0;

        int menor3 = 0;
        int mayor4 = 0;
        int entre45y5 = 0;

        do {

            pregunta = 1;
            total = 0;

            do {

                System.out.println("Cuestionario " + cuestionario);
                System.out.println("Pregunta " + pregunta);
                System.out.println("Ingrese una respuesta de 1 a 5:");

                respuesta = sc.nextInt();

                total = total + respuesta;
                pregunta++;

            } while (pregunta <= 23);

            promedio = total / 23.0;

            System.out.println("Promedio del cuestionario: " + promedio);

            sumaPromedios = sumaPromedios + promedio;

            if (promedio > mayor) {
                mayor = promedio;
                cuestionarioMayor = cuestionario;
            }

            if (promedio < menor) {
                menor = promedio;
                cuestionarioMenor = cuestionario;
            }

            if (promedio < 3) {
                menor3++;
            }

            if (promedio > 4) {
                mayor4++;
            }

            if (promedio >= 4.5 && promedio <= 5) {
                entre45y5++;
            }

            cuestionario++;

        } while (cuestionario <= 64);

        System.out.println("\n--- RESULTADOS ---");

        System.out.println("Promedio general: " + sumaPromedios / 64);
        System.out.println("Promedio mas alto: " + mayor);
        System.out.println("Cuestionario con promedio mas alto: " + cuestionarioMayor);
        System.out.println("Promedio mas bajo: " + menor);
        System.out.println("Cuestionario con promedio mas bajo: " + cuestionarioMenor);

        System.out.println("Porcentaje de cuestionarios con promedio menor a 3 respecto a los mayores a 4: "
                + (menor3 * 100.0 / mayor4) + "%");

        System.out.println("Porcentaje de cuestionarios entre 4.5 y 5: "
                + (entre45y5 * 100.0 / 64) + "%");
    }
}
