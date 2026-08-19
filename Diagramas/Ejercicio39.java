public class Ejercicio39 {
    public static void main(String[] args) {

        double precio;
        double devaluacion;
        double incremento;
        double valorDevaluacion;
        double valorIncremento;

        System.out.println("Ingrese el precio del automovil y del terreno:");
        precio = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de devaluacion del automovil:");
        devaluacion = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de incremento del terreno:");
        incremento = Double.parseDouble(System.console().readLine());

        valorDevaluacion = precio * devaluacion / 100;
        valorIncremento = precio * incremento / 100;

        if (valorDevaluacion <= valorIncremento / 2) {

            System.out.println("Debe comprar el automovil.");

        } else {

            System.out.println("No debe comprar el automovil.");
        }

        System.out.println("Valor de la devaluacion: $" + valorDevaluacion);
        System.out.println("Valor del incremento del terreno: $" + valorIncremento);
    }
}