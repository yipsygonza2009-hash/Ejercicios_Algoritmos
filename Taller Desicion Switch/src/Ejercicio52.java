import java.util.Scanner;
public class Ejercicio52 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int persona = 1;
            int edad;
            double peso;

            double pesoNinos = 0;
            double pesoJovenes = 0;
            double pesoAdultos = 0;
            double pesoViejos = 0;

            int cantidadNinos = 0;
            int cantidadJovenes = 0;
            int cantidadAdultos = 0;
            int cantidadViejos = 0;

            do {

                System.out.println("Persona " + persona);

                System.out.println("Ingrese la edad:");
                edad = sc.nextInt();

                System.out.println("Ingrese el peso:");
                peso = sc.nextDouble();

                if (edad >= 0 && edad <= 12) {

                    pesoNinos = pesoNinos + peso;
                    cantidadNinos++;

                } else if (edad >= 13 && edad <= 29) {

                    pesoJovenes = pesoJovenes + peso;
                    cantidadJovenes++;

                } else if (edad >= 30 && edad <= 59) {

                    pesoAdultos = pesoAdultos + peso;
                    cantidadAdultos++;

                } else {

                    pesoViejos = pesoViejos + peso;
                    cantidadViejos++;
                }

                persona++;

            } while (persona <= 100);

            System.out.println("Promedio de peso de los niños: " + pesoNinos / cantidadNinos);
            System.out.println("Promedio de peso de los jovenes: " + pesoJovenes / cantidadJovenes);
            System.out.println("Promedio de peso de los adultos: " + pesoAdultos / cantidadAdultos);
            System.out.println("Promedio de peso de los viejos: " + pesoViejos / cantidadViejos);
        }
    }

