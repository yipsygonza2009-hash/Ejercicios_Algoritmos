import java.util.Scanner;

public class Ejercicio63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i = 1;
        int edad;
        char sexo, estado;

        int mujeres = 0, hombres = 0;
        int sumaMujeres = 0, sumaHombres = 0;
        int mujeresAdultas = 0;
        int hombresJovenes = 0;
        int hombresSolteros = 0;
        int mujeresSolteras = 0;

        System.out.println("Cantidad de alumnos:");
        n = sc.nextInt();

        do {

            System.out.println("Edad:");
            edad = sc.nextInt();

            System.out.println("Sexo (M/F):");
            sexo = sc.next().charAt(0);

            System.out.println("Estado civil (S/C/D):");
            estado = sc.next().charAt(0);

            if (sexo == 'F') {

                mujeres++;
                sumaMujeres += edad;

                if (edad > 21)
                    mujeresAdultas++;

                if (estado == 'S')
                    mujeresSolteras++;

            } else {

                hombres++;
                sumaHombres += edad;

                if (edad > 17 && edad < 21)
                    hombresJovenes++;

                if (estado == 'S')
                    hombresSolteros++;
            }

            i++;

        } while (i <= n);

        System.out.println("Promedio mujeres: " + sumaMujeres / (double) mujeres);
        System.out.println("Promedio hombres: " + sumaHombres / (double) hombres);

        System.out.println("Mujeres: " + mujeres);
        System.out.println("Hombres: " + hombres);

        System.out.println("Porcentaje mujeres adultas: "
                + mujeresAdultas * 100.0 / mujeres + "%");

        System.out.println("Porcentaje hombres jovenes: "
                + hombresJovenes * 100.0 / hombres + "%");

        System.out.println("Hombres solteros: " + hombresSolteros);
        System.out.println("Mujeres solteras: " + mujeresSolteras);
    }
}