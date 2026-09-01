import java.util.Scanner;

public class Ejercicio76 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int g, n, m;

        double sumaGeneral = 0;
        int cantidadAlumnos = 0;

        System.out.println("Cantidad de grupos:");
        g = sc.nextInt();

        System.out.println("Cantidad de alumnos por grupo:");
        n = sc.nextInt();

        System.out.println("Cantidad de materias por alumno:");
        m = sc.nextInt();

        int grupo = 1;

        do {

            double sumaGrupo = 0;

            int alumno = 1;

            do {

                double sumaAlumno = 0;

                int materia = 1;

                do {

                    double sumaMateria = 0;

                    int nota = 1;

                    do {

                        System.out.println("Nota:");
                        sumaMateria = sumaMateria + sc.nextDouble();

                        nota++;

                    } while (nota <= 3);

                    double promedioMateria = sumaMateria / 3;
                    sumaAlumno = sumaAlumno + promedioMateria;

                    materia++;

                } while (materia <= m);

                double promedioAlumno = sumaAlumno / m;

                System.out.println("Promedio del alumno: "
                        + promedioAlumno);

                sumaGrupo = sumaGrupo + promedioAlumno;
                sumaGeneral = sumaGeneral + promedioAlumno;

                cantidadAlumnos++;
                alumno++;

            } while (alumno <= n);

            System.out.println("Promedio del grupo: "
                    + sumaGrupo / n);

            grupo++;

        } while (grupo <= g);

        System.out.println("Promedio general: "
                + sumaGeneral / cantidadAlumnos);
    }
}