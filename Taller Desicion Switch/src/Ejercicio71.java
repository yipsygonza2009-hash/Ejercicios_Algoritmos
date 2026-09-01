import java.util.Scanner;

public class Ejercicio71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;
        char sexo;

        int total = 0;
        int tachira = 0;
        int capital = 0;

        int grupo1 = 0;
        int grupo2 = 0;
        int grupo3 = 0;
        int grupo4 = 0;

        int ninos = 0;
        int ninas = 0;

        do {

            System.out.println("Edad (0 para terminar):");
            edad = sc.nextInt();

            if (edad != 0) {

                System.out.println("Sexo (M/F):");
                sexo = sc.next().charAt(0);

                System.out.println("Estado (T=Tachira, C=Capital, O=Otro):");
                char estado = sc.next().charAt(0);

                total++;

                if (estado == 'T')
                    tachira++;

                if (estado == 'C')
                    capital++;

                if (edad < 1)
                    grupo1++;
                else if (edad <= 3)
                    grupo2++;
                else if (edad <= 6)
                    grupo3++;
                else
                    grupo4++;

                if (sexo == 'M')
                    ninos++;
                else
                    ninas++;
            }

        } while (edad != 0);

        System.out.println("Porcentaje Tachira: "
                + tachira * 100.0 / total + "%");

        System.out.println("Porcentaje Distrito Capital: "
                + capital * 100.0 / total + "%");

        System.out.println("Grupo 1: " + grupo1);
        System.out.println("Grupo 2: " + grupo2);
        System.out.println("Grupo 3: " + grupo3);
        System.out.println("Grupo 4: " + grupo4);

        System.out.println("Ninos: " + ninos);
        System.out.println("Ninas: " + ninas);
    }
}