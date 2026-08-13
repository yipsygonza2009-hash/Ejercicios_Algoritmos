import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double chelines, dracmas, pesetas;
        double pesetasResultado;
        double francosFranceses;
        double dolares;
        double liras;

        System.out.print("Ingrese chelines austríacos: ");
        chelines = leer.nextDouble();

        pesetasResultado = (chelines * 956.871) / 100;

        System.out.println("Equivalente en pesetas: " + pesetasResultado);

        System.out.print("Ingrese dracmas griegos: ");
        dracmas = leer.nextDouble();

        francosFranceses = ((dracmas * 88.607) / 100) / 20.110;

        System.out.println("Equivalente en francos franceses: " + francosFranceses);

        System.out.print("Ingrese pesetas: ");
        pesetas = leer.nextDouble();

        dolares = pesetas / 122.499;
        liras = (pesetas / 9.289) * 100;

        System.out.println("Equivalente en dólares: " + dolares);
        System.out.println("Equivalente en liras italianas: " + liras);

        leer.close();
    }
}
    

