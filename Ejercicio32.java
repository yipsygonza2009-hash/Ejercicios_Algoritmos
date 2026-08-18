public class Ejercicio32 {
    
    public static void main(String []args) {

        int P;
        int Q;
        int resultado;

        System.out.println("Ingrese el valor de P:");
        P = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el valor de Q:");
        Q = Integer.parseInt(System.console().readLine());

        resultado = P * P * P + Q * Q * Q * Q - 2 * P * P;

        if (resultado > 680) {
            System.out.println("Los valores de P y Q satisfacen la expresion.");
            System.out.println("P = " + P);
            System.out.println("Q = " + Q);
        } else {
            System.out.println("Los valores de P y Q no satisfacen la expresion.");
        }
    }
}
