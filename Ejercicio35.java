public class Ejercicio35 {
    
    public static void main(String [] args) {

        double temperatura;

        System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        temperatura = Double.parseDouble(System.console().readLine());

        if (temperatura > 85) {
            System.out.println("El deporte apropiado es Natacion");

        } else if (temperatura > 70) {
            System.out.println("El deporte apropiado es Tenis");

        } else if (temperatura > 32) {
            System.out.println("El deporte apropiado es Golf");

        } else if (temperatura > 10) {
            System.out.println("El deporte apropiado es Esqui");

        } else {
            System.out.println("El deporte apropiado es Marcha");
        }
    }
}
        

