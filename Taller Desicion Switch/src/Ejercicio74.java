import java.util.Scanner;

public class Ejercicio74 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int obreros, i = 1;
        int limite;

        String nombre;
        int produccion;
        int totalSemana;

        int alcanzaron = 0;
        int sumaGeneral = 0;

        String mayorNombre = "";
        int mayorProduccion = 0;

        System.out.println("Cantidad de obreros:");
        obreros = sc.nextInt();

        System.out.println("Limite semanal:");
        limite = sc.nextInt();

        do {

            System.out.println("Nombre del obrero:");
            nombre = sc.next();

            totalSemana = 0;

            int dia = 1;

            do {

                System.out.println("Bloques producidos en el dia " + dia + ":");
                produccion = sc.nextInt();

                totalSemana = totalSemana + produccion;

                dia++;

            } while (dia <= 7);

            System.out.println("Total semanal: " + totalSemana);
            System.out.println("Porcentaje: "
                    + totalSemana * 100.0 / limite + "%");

            if (totalSemana >= limite)
                alcanzaron++;

            if (totalSemana > mayorProduccion) {
                mayorProduccion = totalSemana;
                mayorNombre = nombre;
            }

            sumaGeneral = sumaGeneral + totalSemana;

            i++;

        } while (i <= obreros);

        System.out.println("Porcentaje que alcanzaron: "
                + alcanzaron * 100.0 / obreros + "%");

        System.out.println("Mayor productor: " + mayorNombre);
        System.out.println("Produccion: " + mayorProduccion);

        System.out.println("Promedio: "
                + sumaGeneral / (double) obreros);
    }
}