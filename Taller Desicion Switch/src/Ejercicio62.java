import java.util.Scanner;

public class Ejercicio62 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empresas;
        int empresa = 1;

        int actividad;
        int localizacion;
        int trabajadores;

        int agricolas = 0;
        int mineras = 0;
        int minerasSur = 0;
        int industriales = 0;

        int trabajadoresAgricolas = 0;
        int trabajadoresMineras = 0;
        int trabajadoresIndustriales = 0;

        int norteIndustriales = 0;
        int surIndustriales = 0;

        System.out.println("Ingrese la cantidad de empresas:");
        empresas = sc.nextInt();

        do {

            System.out.println("\nEmpresa " + empresa);

            System.out.println("Actividad:");
            System.out.println("1. Agricola");
            System.out.println("2. Minera");
            System.out.println("3. Industrial");
            actividad = sc.nextInt();

            System.out.println("Localizacion:");
            System.out.println("1. Norte");
            System.out.println("2. Sur");
            localizacion = sc.nextInt();

            System.out.println("Cantidad de trabajadores:");
            trabajadores = sc.nextInt();

            if (actividad == 1) {

                agricolas++;
                trabajadoresAgricolas += trabajadores;

            } else if (actividad == 2) {

                mineras++;
                trabajadoresMineras += trabajadores;

                if (localizacion == 2)
                    minerasSur++;

            } else if (actividad == 3) {

                industriales++;
                trabajadoresIndustriales += trabajadores;

                if (localizacion == 1)
                    norteIndustriales++;
                else
                    surIndustriales++;
            }

            empresa++;

        } while (empresa <= empresas);

        System.out.println("\n--- RESULTADOS ---");

        System.out.println("Porcentaje de empresas agricolas: "
                + agricolas * 100.0 / empresas + "%");

        System.out.println("Porcentaje de empresas mineras del sur: "
                + minerasSur * 100.0 / empresas + "%");

        if (agricolas > 0)
            System.out.println("Promedio de trabajadores en empresas agricolas: "
                    + trabajadoresAgricolas / (double) agricolas);

        if (mineras > 0)
            System.out.println("Promedio de trabajadores en empresas mineras: "
                    + trabajadoresMineras / (double) mineras);

        if (industriales > 0)
            System.out.println("Promedio de trabajadores en empresas industriales: "
                    + trabajadoresIndustriales / (double) industriales);

        if (norteIndustriales > surIndustriales)
            System.out.println("La localizacion con mas empresas industriales es: Norte");
        else if (surIndustriales > norteIndustriales)
            System.out.println("La localizacion con mas empresas industriales es: Sur");
        else
            System.out.println("Hay la misma cantidad de empresas industriales.");
    }
}