import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double nota1, nota2, nota3;
        double examenFinal, trabajoFinal;
        double promedioParciales;
        double notaFinal;

        System.out.print("Nota parcial 1: ");
        nota1 = leer.nextDouble();

        System.out.print("Nota parcial 2: ");
        nota2 = leer.nextDouble();

        System.out.print("Nota parcial 3: ");
        nota3 = leer.nextDouble();

        System.out.print("Nota examen final: ");
        examenFinal = leer.nextDouble();

        System.out.print("Nota trabajo final: ");
        trabajoFinal = leer.nextDouble();

        promedioParciales = (nota1 + nota2 + nota3) / 3;

        notaFinal = (promedioParciales * 0.55)
                + (examenFinal * 0.30)
                + (trabajoFinal * 0.15);

        System.out.println("La calificación final es: " + notaFinal);

        leer.close();
    }
}