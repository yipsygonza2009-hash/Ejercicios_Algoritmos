public class Ejercicio30s {
    
    public static void main(String[] args) {

        int A;
        int B;
        int C;
        int D;
        int N;
        int resultado;
        int caso;

        A = Integer.parseInt(System.console().readLine("Ingrese digito A: "));
        B = Integer.parseInt(System.console().readLine("Ingrese digito B: "));
        C = Integer.parseInt(System.console().readLine("Ingrese digito C: "));
        D = Integer.parseInt(System.console().readLine("Ingrese digito D: "));

        N = A * 1000 + B * 100 + C * 10 + D;

        if (D >= 5) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                resultado = (N / 100 + 1) * 100;
                break;

            case 2:
                resultado = (N / 100) * 100;
                break;

            default:
                resultado = N;
        }

        System.out.println("Numero original: " + N);
        System.out.println("Numero redondeado: " + resultado);
    }
}

