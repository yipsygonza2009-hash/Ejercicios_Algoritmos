import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double a, b, c;
        double p;
        double area;

        System.out.print("Ingrese el lado A: ");
        a = leer.nextDouble();

        System.out.print("Ingrese el lado B: ");
        b = leer.nextDouble();

        System.out.print("Ingrese el lado C: ");
        c = leer.nextDouble();

        p = (a + b + c) / 2;

        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("El área del triángulo es: " + area);

        leer.close();
    }
}

