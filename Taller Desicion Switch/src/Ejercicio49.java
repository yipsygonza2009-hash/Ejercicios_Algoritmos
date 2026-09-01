import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//3 preguntas(p)//
        int persona = 1;
        int p1, p2, p3;

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;

        do {

            System.out.println("Persona " + persona);

            System.out.println("¿Respondio correctamente la pregunta 1? (1 = Si, 0 = No)");
            p1 = sc.nextInt();

            System.out.println("¿Respondio correctamente la pregunta 2? (1 = Si, 0 = No)");
            p2 = sc.nextInt();

            System.out.println("¿Respondio correctamente la pregunta 3? (1 = Si, 0 = No)");
            p3 = sc.nextInt();

            if (p1 == 1 && p2 == 1 && p3 == 1) {
                a++;
            }

            if (p1 == 1 && p2 == 1 && p3 == 0) {
                b++;
            }

            if (p1 == 1 && p2 == 0 && p3 == 1) {
                c++;
            }

            if (p1 == 0 && p2 == 1 && p3 == 1) {
                d++;
            }

            if (p1 == 1) {
                e++;
            }

            if (p2 == 1) {
                f++;
            }

            if (p3 == 1) {
                g++;
            }

            if (p1 == 0 && p2 == 0 && p3 == 0) {
                h++;
            }

            persona++;

        } while (persona <= 100);

        System.out.println("Cantidad de personas:");
        System.out.println("a. Las tres preguntas: " + a);
        System.out.println("b. Primera y segunda: " + b);
        System.out.println("c. Primera y tercera: " + c);
        System.out.println("d. Segunda y tercera: " + d);
        System.out.println("e. Primera por lo menos: " + e);
        System.out.println("f. Segunda por lo menos: " + f);
        System.out.println("g. Tercera por lo menos: " + g);
        System.out.println("h. Ninguna pregunta: " + h);
    }
}

