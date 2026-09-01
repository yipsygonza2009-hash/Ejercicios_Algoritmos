import java.util.Scanner;

public class Ejercicio77 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int estados = 1;
        int municipios;

        double totalEstados = 0;
        double totalPais;

        String mayorEstado = "";
        String menorEstado = "";

        double mayor = 0;
        double menor = 0;

        System.out.println("Total de habitantes del pais:");
        totalPais = sc.nextDouble();

        do {

            System.out.println("Nombre del estado:");
            String nombre = sc.next();

            System.out.println("Cantidad de municipios:");
            municipios = sc.nextInt();

            double poblacionEstado = 0;

            int municipio = 1;

            do {

                System.out.println("Habitantes del municipio:");
                poblacionEstado += sc.nextDouble();

                municipio++;

            } while (municipio <= municipios);

            if (estados == 1) {
                mayor = poblacionEstado;
                menor = poblacionEstado;
                mayorEstado = nombre;
                menorEstado = nombre;
            }

            if (poblacionEstado > mayor) {
                mayor = poblacionEstado;
                mayorEstado = nombre;
            }

            if (poblacionEstado < menor) {
                menor = poblacionEstado;
                menorEstado = nombre;
            }

            totalEstados += poblacionEstado;

            System.out.println("Promedio del estado: "
                    + poblacionEstado / municipios);

            estados++;

        } while (estados <= 5);

        System.out.println("Estado con mayor poblacion: "
                + mayorEstado + " " + mayor);

        System.out.println("Estado con menor poblacion: "
                + menorEstado + " " + menor);

        System.out.println("Porcentaje respecto al pais: "
                + totalEstados * 100 / totalPais + "%");

        System.out.println("Promedio de habitantes por estado: "
                + totalEstados / 5);
    }
}