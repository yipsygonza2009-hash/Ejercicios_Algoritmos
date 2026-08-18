public class Ejercicio40 {
    public static void main(String[] args) {

        int lecturaAnterior;
        int lecturaActual;
        int consumo;
        double pago;

        System.out.println("Ingrese la lectura anterior:");
        lecturaAnterior = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la lectura actual:");
        lecturaActual = Integer.parseInt(System.console().readLine());

        consumo = lecturaActual - lecturaAnterior;

        if (consumo <= 100) {

            pago = consumo * 2622;

        } else if (consumo <= 300) {

            pago = consumo * 79.78;

        } else if (consumo <= 500) {

            pago = consumo * 89.52;

        } else {

            pago = consumo * 97.95;
        }

        System.out.println("El consumo fue de: " + consumo + " Kwh");
        System.out.println("El monto a pagar es: $" + pago);
    }
}