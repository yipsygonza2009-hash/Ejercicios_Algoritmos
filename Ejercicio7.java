import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double metros;
        double pulgadas;
        double pies;

        System.out.print("Ingrese los metros: ");
        metros = leer.nextDouble();

        pulgadas = metros * 39.27;
        pies = pulgadas / 12;

        System.out.println("Pulgadas: " + pulgadas);
        System.out.println("Pies: " + pies);

        leer.close();
    }
}
    

