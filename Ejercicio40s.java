public class Ejercicio40s {
    
    public static void main(String[] args) {

        double lecturaAnterior;
        double lecturaActual;
        double consumo;
        double costo;
        double monto;

        int caso;

        lecturaAnterior = Double.parseDouble(
            System.console().readLine("Ingrese lectura anterior: ")
        );

        lecturaActual = Double.parseDouble(
            System.console().readLine("Ingrese lectura actual: ")
        );

        consumo = lecturaActual - lecturaAnterior;

        if (consumo <= 100) {
            caso = 1;
        } else if (consumo <= 300) {
            caso = 2;
        } else if (consumo <= 500) {
            caso = 3;
        } else {
            caso = 4;
        }

        switch (caso) {

            case 1:
                costo = 2622.00;
                break;

            case 2:
                costo = 79.78;
                break;

            case 3:
                costo = 89.52;
                break;

            case 4:
                costo = 97.95;
                break;

            default:
                costo = 0;
        }

        monto = consumo * costo;

        System.out.println("Consumo: " + consumo + " Kwh");
        System.out.println("Costo por Kwh: " + costo);
        System.out.println("Monto a pagar: $" + monto);
    }
}

