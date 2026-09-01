import java.util.Scanner;

public class Ejercicio72 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double G = 6.67259E-11;
        final double M = 5.97E24;

        int n, i = 1;

        double masa, altura, fuerza;
        double mayorFuerza = 0;
        double menorFuerza = 0;
        double mayorMasa = 0;
        double menorAltura = 0;
        double mayorAltura = 0;
        double sumaFuerza = 0;
        double sumaMasa = 0;

        System.out.println("Cantidad de satelites:");
        n = sc.nextInt();

        do {

            System.out.println("Masa del satelite:");
            masa = sc.nextDouble();

            System.out.println("Altura del satelite:");
            altura = sc.nextDouble();

            fuerza = G * masa * M / (altura * altura);

            if (i == 1) {
                mayorFuerza = fuerza;
                menorFuerza = fuerza;
                mayorMasa = masa;
                menorAltura = altura;
                mayorAltura = altura;
            }

            if (fuerza > mayorFuerza)
                mayorFuerza = fuerza;

            if (fuerza < menorFuerza)
                menorFuerza = fuerza;

            if (masa > mayorMasa)
                mayorMasa = masa;

            if (altura < menorAltura)
                menorAltura = altura;

            if (altura > mayorAltura)
                mayorAltura = altura;

            sumaFuerza += fuerza;
            sumaMasa += masa;

            i++;

        } while (i <= n);

        System.out.println("Mayor fuerza: " + mayorFuerza);
        System.out.println("Menor fuerza: " + menorFuerza);
        System.out.println("Promedio fuerza: " + sumaFuerza / n);
        System.out.println("Mayor masa: " + mayorMasa);
        System.out.println("Promedio masa: " + sumaMasa / n);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Mayor altura: " + mayorAltura);
    }
}