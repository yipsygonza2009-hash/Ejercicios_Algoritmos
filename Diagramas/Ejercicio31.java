public class Ejercicio31 {
    
    public static void main(String []args) {

        int distancia;
        int pago;
        System.out.println("Ingrese la distancia recorrida en kilometros:");
        distancia = Integer.parseInt(System.console().readLine());

        if (distancia <= 300) {

            pago = 5000;

        } else if (distancia <= 1000) {

            pago = 5000 + (distancia - 300) * 200;

        } else {

            pago = 5000 + (700 * 200) + (distancia - 1000) * 150;
        }

        System.out.println("El valor a pagar es: $" + pago);
    }
}
