import java.util.Scanner;
public class Ejercicio55 {

        public static void main(String[] args) {

            int k = 1;
            int terminos = 0;
            double suma = 0;
            double termino;

            do {

                termino = (k * k + 1.0) / k;

                if (suma + termino <= 1000) {
                    suma = suma + termino;
                    terminos++;
                    k++;
                } else {
                    break;
                }

            } while (suma < 1000);

            System.out.println("Numero de terminos: " + terminos);
            System.out.println("Suma: " + suma);
        }
    }

