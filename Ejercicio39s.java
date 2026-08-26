public class Ejercicio39s {
    
    public static void main(String[] args) {

        double precio;
        double devaluacionPorcentaje;
        double incrementoPorcentaje;

        double devaluacion;
        double incremento;

        int caso;

        precio = Double.parseDouble(
            System.console().readLine("Ingrese el precio del automovil y terreno: ")
        );

        devaluacionPorcentaje = Double.parseDouble(
            System.console().readLine("Ingrese porcentaje de devaluacion del automovil: ")
        );

        incrementoPorcentaje = Double.parseDouble(
            System.console().readLine("Ingrese porcentaje de incremento del terreno: ")
        );

        devaluacion = precio * devaluacionPorcentaje / 100;
        incremento = precio * incrementoPorcentaje / 100;

        if (devaluacion <= incremento / 2) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                System.out.println("Debe comprar el automovil.");
                break;

            case 2:
                System.out.println("No debe comprar el automovil.");
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

