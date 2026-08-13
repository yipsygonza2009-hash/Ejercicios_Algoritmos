import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double matEx, matT1, matT2, matT3;
        double fisEx, fisT1, fisT2;
        double quiEx, quiT1, quiT2, quiT3;

        double matematica, fisica, quimica, promedioGeneral;

        System.out.print("Examen Matemática: ");
        matEx = leer.nextDouble();

        System.out.print("Tarea 1: ");
        matT1 = leer.nextDouble();

        System.out.print("Tarea 2: ");
        matT2 = leer.nextDouble();

        System.out.print("Tarea 3: ");
        matT3 = leer.nextDouble();

        matematica = (matEx * 0.90) + (((matT1 + matT2 + matT3) / 3) * 0.10);

        System.out.print("Examen Física: ");
        fisEx = leer.nextDouble();

        System.out.print("Tarea 1: ");
        fisT1 = leer.nextDouble();

        System.out.print("Tarea 2: ");
        fisT2 = leer.nextDouble();

        fisica = (fisEx * 0.80) + (((fisT1 + fisT2) / 2) * 0.20);

        System.out.print("Examen Química: ");
        quiEx = leer.nextDouble();

        System.out.print("Tarea 1: ");
        quiT1 = leer.nextDouble();

        System.out.print("Tarea 2: ");
        quiT2 = leer.nextDouble();

        System.out.print("Tarea 3: ");
        quiT3 = leer.nextDouble();

        quimica = (quiEx * 0.85) + (((quiT1 + quiT2 + quiT3) / 3) * 0.15);

        promedioGeneral = (matematica + fisica + quimica) / 3;

        System.out.println("Matemática: " + matematica);
        System.out.println("Física: " + fisica);
        System.out.println("Química: " + quimica);
        System.out.println("Promedio General: " + promedioGeneral);

        leer.close();
    }
}
