import java.util.Scanner;

public class Ejercicio59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double matematica, programacion, ingles;
        double menorProgramacion = 0;
        double sumaProgramacion = 0;

        int alumnos = 0;
        int noIngles = 0;
        int siIngles = 0;
        int aprobaronTodas = 0;
        int reprobaronMatematica = 0;

        do {

            System.out.println("Nota de Matematica (-1 para terminar):");
            matematica = sc.nextDouble();

            if (matematica != -1) {

                System.out.println("Nota de Programacion:");
                programacion = sc.nextDouble();

                System.out.println("Nota de Ingles (-1 si no presento):");
                ingles = sc.nextDouble();

                alumnos++;
                sumaProgramacion = sumaProgramacion + programacion;

                if (alumnos == 1 || programacion < menorProgramacion)
                    menorProgramacion = programacion;

                if (ingles == -1)
                    noIngles++;
                else
                    siIngles++;

                if (matematica >= 3 && programacion >= 3 && ingles >= 3)
                    aprobaronTodas++;

                if (matematica < 3)
                    reprobaronMatematica++;
            }

        } while (matematica != -1);

        System.out.println("Nota menor de Programacion: " + menorProgramacion);
        System.out.println("Promedio de Programacion: " + sumaProgramacion / alumnos);
        System.out.println("Aprobaron todas: " + aprobaronTodas);

        System.out.println("Porcentaje no presentaron Ingles: "
                + noIngles * 100.0 / siIngles + "%");

        System.out.println("Porcentaje reprobaron Matematica: "
                + reprobaronMatematica * 100.0 / alumnos + "%");
    }
}
