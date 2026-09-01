import java.util.Scanner;
public class Ejercicio47 {

    public static void main(String []args) {

        int numero = 1;
        Scanner sc = new Scanner(System.in);
        do {
            if (numero % 7 != 0) {
                System.out.println(numero);
            }
            numero = numero + 2;
        } while (numero<100);
    }
}
