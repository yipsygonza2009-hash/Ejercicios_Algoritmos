public class Ejercicio37 {
    public static void main(String[] args) {

        int A;
        int B;
        int C;
        int mayor;
        double S;
        double area;

        System.out.println("Ingrese el lado A:");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado B:");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado C:");
        C = Integer.parseInt(System.console().readLine());

        mayor = Math.max(A, Math.max(B, C));

        if (A + B + C - mayor > mayor) {

            System.out.println("Los datos si corresponden a un triangulo.");

            if (A == B && B == C) {
                System.out.println("El triangulo es equilatero.");

            } else if (A == B || A == C || B == C) {
                System.out.println("El triangulo es isosceles.");

            } else {
                System.out.println("El triangulo es escaleno.");
            }

            S = (A + B + C) / 2.0;

            area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

            System.out.println("El area del triangulo es: " + area);

        } else {

            System.out.println("Los datos no corresponden a un triangulo.");
        }
    }
}