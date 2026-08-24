public class Ejercicio35s {
    
    public static void main(String[] args) {

        double temperatura;
        int caso;

        temperatura = Double.parseDouble(
            System.console().readLine("Ingrese la temperatura en Fahrenheit: ")
        );

        if (temperatura > 85) {
            caso = 1;
        } else if (temperatura > 70) {
            caso = 2;
        } else if (temperatura > 32) {
            caso = 3;
        } else if (temperatura > 10) {
            caso = 4;
        } else {
            caso = 5;
        }

        switch (caso) {

            case 1:
                System.out.println("Deporte apropiado: Natacion");
                break;

            case 2:
                System.out.println("Deporte apropiado: Tenis");
                break;

            case 3:
                System.out.println("Deporte apropiado: Golf");
                break;

            case 4:
                System.out.println("Deporte apropiado: Esqui");
                break;

            case 5:
                System.out.println("Deporte apropiado: Marcha");
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

