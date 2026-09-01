public class Ejercicio69 {

    public static void main(String[] args) {

        int a = 2;
        int encontrados = 0;

        do {

            int sumaA = 0;
            int divisor = 1;

            do {

                if (a % divisor == 0)
                    sumaA = sumaA + divisor;

                divisor++;

            } while (divisor < a);

            int b = sumaA;

            if (b > a) {

                int sumaB = 0;
                divisor = 1;

                do {

                    if (b % divisor == 0)
                        sumaB = sumaB + divisor;

                    divisor++;

                } while (divisor < b);

                if (sumaB == a) {
                    System.out.println(a + " y " + b);
                    encontrados++;
                }
            }

            a++;

        } while (encontrados < 1);
    }
}