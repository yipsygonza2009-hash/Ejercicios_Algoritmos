public class Ejercicio30 {

    public static void main( String []args) {

        int A;
        int B;
        int C;
        int D;
        int N;

        System.out.println("Ingrese el digito A:");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el digito B:");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el digito C:");
        C = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el digito D:");
        D = Integer.parseInt(System.console().readLine());

        N = A * 1000 + B * 100 + C * 10 + D;

        if (C >= 5) {
            B = B + 1;
        }

        N = A * 1000 + B * 100;

        System.out.println("El numero redondeado es: " + N);
    }


}