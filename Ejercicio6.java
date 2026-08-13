import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int hombres, mujeres;
        int total;

        double porcentajeHombres;
        double porcentajeMujeres;

        System.out.print("Cantidad de hombres: ");
        hombres = leer.nextInt();

        System.out.print("Cantidad de mujeres: ");
        mujeres = leer.nextInt();

        total = hombres + mujeres;

        porcentajeHombres = (hombres * 100.0) / total;
        porcentajeMujeres = (mujeres * 100.0) / total;

        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");

        leer.close();
    }
}
    

