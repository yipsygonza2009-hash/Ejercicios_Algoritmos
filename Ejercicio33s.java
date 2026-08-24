public class Ejercicio33s {
    
    public static void main(String[] args) {

        String nombre;
        double monto;
        double descuento;
        double montoPagar;

        int caso;

        nombre = System.console().readLine("Ingrese el nombre del cliente: ");

        monto = Double.parseDouble(
            System.console().readLine("Ingrese el monto de la compra: ")
        );

        if (monto < 500) {
            caso = 1;
        } else if (monto <= 1000) {
            caso = 2;
        } else if (monto <= 7000) {
            caso = 3;
        } else if (monto <= 15000) {
            caso = 4;
        } else {
            caso = 5;
        }

        switch (caso) {

            case 1:
                descuento = 0;
                break;

            case 2:
                descuento = monto * 0.05;
                break;

            case 3:
                descuento = monto * 0.11;
                break;

            case 4:
                descuento = monto * 0.18;
                break;

            case 5:
                descuento = monto * 0.25;
                break;

            default:
                descuento = 0;
        }

        montoPagar = monto - descuento;

        System.out.println("Cliente: " + nombre);
        System.out.println("Monto de compra: $" + monto);
        System.out.println("Descuento recibido: $" + descuento);
        System.out.println("Monto a pagar: $" + montoPagar);
    }
}

