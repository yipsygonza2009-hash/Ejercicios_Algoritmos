
public class Ejercicio16 {

    public static void main(String[] args) {

        double largo = 4;
        double ancho = 1.5;
        double areaLamina;
        double areaPieza;
        int piezas;
        double desperdicio;

        areaLamina = largo * ancho;
        areaPieza = 0.5;

        piezas = (int)(areaLamina / areaPieza);

        desperdicio = areaLamina - (piezas * areaPieza);

        System.out.println("Piezas fabricadas: " + piezas);
        System.out.println("Desperdicio: " + desperdicio + " metros cuadrados");

    }
}