public class Ejercicio31s {
    
    public static void main(String[] args) {

        double distancia;
        double pago;
        int caso;

        distancia = Double.parseDouble(
            System.console().readLine("Ingrese la distancia recorrida en km: ")
        );

        if (distancia <= 300) {
            caso = 1;
        } else if (distancia < 1000) {
            caso = 2;
        } else {
            caso = 3;
        }

        switch (caso) {

            case 1:
                pago = 5000;
                break;

            case 2:
                pago = 5000 + (distancia - 300) * 200;
                break;

            case 3:
                pago = 5000 + (700 * 200) + (distancia - 1000) * 150;
                break;

            default:
                pago = 0;
        }

        System.out.println("El valor a pagar es: $" + pago);
    }
}

