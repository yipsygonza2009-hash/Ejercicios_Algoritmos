public class Ejercicio32s {
    
    public static void main(String[] args) {

        int P;
        int Q;
        double resultado;
        int caso;

        P = Integer.parseInt(System.console().readLine("Ingrese P: "));
        Q = Integer.parseInt(System.console().readLine("Ingrese Q: "));

        resultado = Math.pow(P, 3) + Math.pow(Q, 4) - 2 * Math.pow(P, 2);

        if (resultado > 680) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                System.out.println("P = " + P);
                System.out.println("Q = " + Q);
                break;

            case 2:
                System.out.println("Los valores no satisfacen la expresion.");
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

