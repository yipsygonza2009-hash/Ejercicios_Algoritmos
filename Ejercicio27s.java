public class Ejercicio27s {
    
    public static void main(String[] args) {

        double valor1;
        double valor2;
        double valor3;

        double areaTriangulo;
        double areaCirculo;
        double areaRectangulo;

        int caso;

        valor1 = Double.parseDouble(
            System.console().readLine("Ingrese Valor1: ")
        );

        valor2 = Double.parseDouble(
            System.console().readLine("Ingrese Valor2: ")
        );

        valor3 = Double.parseDouble(
            System.console().readLine("Ingrese Valor3: ")
        );

        areaTriangulo = (valor1 * valor2) / 2;
        areaCirculo = valor2 * Math.pow(valor1, 2);
        areaRectangulo = valor1 * valor2;

        if (areaTriangulo == valor3) {
            caso = 1;
        } else if (areaCirculo == valor3) {
            caso = 2;
        } else if (areaRectangulo == valor3) {
            caso = 3;
        } else {
            caso = 4;
        }

        switch (caso) {

            case 1:
                System.out.println("La figura es un TRIANGULO.");
                break;

            case 2:
                System.out.println("La figura es un CIRCULO.");
                break;

            case 3:
                System.out.println("La figura es un RECTANGULO.");
                break;

            case 4:
                System.out.println("No corresponde a ninguna figura.");
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

