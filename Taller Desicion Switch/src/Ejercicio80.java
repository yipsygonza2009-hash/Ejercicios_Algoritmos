import java.util.Scanner;

public class Ejercicio80 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int estados;

        System.out.println("Cantidad de estados:");
        estados = sc.nextInt();

        int estado = 1;

        do {

            int ciudades;

            System.out.println("Cantidad de ciudades:");
            ciudades = sc.nextInt();

            int ciudad = 1;

            do {

                int municipios;

                System.out.println("Cantidad de municipios:");
                municipios = sc.nextInt();

                int municipio = 1;

                do {

                    int personas;

                    System.out.println("Cantidad de personas:");
                    personas = sc.nextInt();

                    int persona = 1;
                    int desempleadosSinEstudio = 0;

                    do {

                        System.out.println("Edad:");
                        int edad = sc.nextInt();

                        System.out.println("Educacion (N/B/S/P):");
                        char educacion = sc.next().charAt(0);

                        System.out.println("Situacion (D/E):");
                        char situacion = sc.next().charAt(0);

                        if (edad > 25 &&
                                educacion == 'N' &&
                                situacion == 'D') {

                            desempleadosSinEstudio++;
                        }

                        persona++;

                    } while (persona <= personas);

                    System.out.println("Personas desempleadas, sin estudio y mayores de 25: "
                            + desempleadosSinEstudio);

                    municipio++;

                } while (municipio <= municipios);

                ciudad++;

            } while (ciudad <= ciudades);

            estado++;

        } while (estado <= estados);
    }
}