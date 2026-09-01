
import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {

        int n, k;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("introduce el valor de N");
            n = sc.nextInt();
            System.out.println("introduce el valor de K");
            k = sc.nextInt();
            System.out.println("k debe ser menor que N");
        } while (k>=n);
        while (n>=k){
            System.out.println(n);
            n--;
        }
    }
}
