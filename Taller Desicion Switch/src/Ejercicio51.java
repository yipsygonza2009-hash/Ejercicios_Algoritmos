import java.util.Scanner;
public class Ejercicio51 {

        public static void main(String[] args) {

            int termino = 6;
            int contador = 1;
            int suma = 0;
            int termino12 = 0;

            do {

                suma = suma + termino;

                if (contador == 12) {
                    termino12 = termino;
                }

                termino = termino + 5;
                contador++;

            } while (contador <= 12);

            System.out.println("El termino 12 es: " + termino12);
            System.out.println("La suma de los 12 primeros terminos es: " + suma);
        }
    }

