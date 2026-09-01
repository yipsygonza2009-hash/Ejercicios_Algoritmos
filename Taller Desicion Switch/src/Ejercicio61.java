import java.util.Scanner;

public class Ejercicio61 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int multiplicador;
        int multiplicando;
        int resultado = 0;

        System.out.println("Ingrese el primer numero:");
        multiplicador = sc.nextInt();

        System.out.println("Ingrese el segundo numero:");
        multiplicando = sc.nextInt();

        do {

            if (multiplicador % 2 != 0)
                resultado = resultado + multiplicando;

            multiplicador = multiplicador / 2;
            multiplicando = multiplicando * 2;

        } while (multiplicador >= 1);

        System.out.println("Resultado: " + resultado);
    }
}