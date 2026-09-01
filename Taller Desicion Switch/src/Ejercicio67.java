public class Ejercicio67 {

    public static void main(String[] args) {

        double deuda = 12775;
        double pago = 100;

        int numeroPago = 1;

        do {

            deuda = deuda - pago;

            System.out.println("Pago " + numeroPago + ": $" + pago);
            System.out.println("Deuda pendiente: $" + deuda);

            if (deuda > 0) {
                pago = pago + 125;
                numeroPago++;
            }

        } while (deuda > 0);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Cantidad de pagos: " + numeroPago);
        System.out.println("Ultimo pago: $" + pago);
    }
}