public class Ejercicio68 {

    public static void main(String[] args) {

        int numero = 1;
        int encontrados = 0;

        do {

            int divisor = 1;
            int suma = 0;

            do {

                if (numero % divisor == 0)
                    suma = suma + divisor;

                divisor++;

            } while (divisor < numero);

            if (suma == numero) {
                System.out.println("Numero perfecto: " + numero);
                encontrados++;
            }

            numero++;

        } while (encontrados < 3);
    }
}