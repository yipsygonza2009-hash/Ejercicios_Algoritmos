import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double a, b, c, d, e, f;
        double x, y;
        double denominador;

        System.out.print("Ingrese a: ");
        a = leer.nextDouble();

        System.out.print("Ingrese b: ");
        b = leer.nextDouble();

        System.out.print("Ingrese c: ");
        c = leer.nextDouble();

        System.out.print("Ingrese d: ");
        d = leer.nextDouble();

        System.out.print("Ingrese e: ");
        e = leer.nextDouble();

        System.out.print("Ingrese f: ");
        f = leer.nextDouble();

        denominador = (a * e) - (b * d);

        x = ((c * e) - (b * f)) / denominador;
        y = ((a * f) - (c * d)) / denominador;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        leer.close();
    }
}
