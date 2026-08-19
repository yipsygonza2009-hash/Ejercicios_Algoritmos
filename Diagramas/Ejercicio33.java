public class Ejercicio33 {
    
    public static void main( String []args) {


        String nombre;
        double compra;
        double descuento;
        double montoPagar;

        System.out.println("Ingrese el nombre del cliente:");
        nombre = System.console().readLine();

        System.out.println("Ingrese el monto de la compra:");
        compra = Double.parseDouble(System.console().readLine());

        if (compra < 500) {
            descuento = 0;

        } else if (compra < 1000) {
            descuento = compra * 5 / 100;

        } else if (compra < 7000) {
            descuento = compra * 11 / 100;

        } else if (compra <= 15000) {
            descuento = compra * 18 / 100;

        } else {
            descuento = compra * 25 / 100;
        }

        montoPagar = compra - descuento;

        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Monto de la compra: $" + compra);
        System.out.println("Descuento recibido: $" + descuento);
        System.out.println("Monto a pagar: $" + montoPagar);
    }
}
