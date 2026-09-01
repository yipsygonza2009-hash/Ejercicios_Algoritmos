import java.util.Scanner;
public class Ejercicio53 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int m, i = 1;
            int edad, tipo, horas;
            char nacionalidad;

            double pago, sueldo, seguro, total = 0;
            int v1 = 0, v2 = 0, v3 = 0;
            int extranjeros = 0, sumaEdad = 0;

            System.out.println("Cantidad de empleados:");
            m = sc.nextInt();

            do {

                System.out.println("Empleado " + i);

                System.out.println("Nacionalidad (V/E):");
                nacionalidad = sc.next().charAt(0);

                System.out.println("Edad:");
                edad = sc.nextInt();

                System.out.println("Tipo de empleado (1/2/3):");
                tipo = sc.nextInt();

                System.out.println("Horas trabajadas:");
                horas = sc.nextInt();

                if (tipo == 1)
                    pago = 5000;
                else if (tipo == 2)
                    pago = 10000;
                else
                    pago = 15000;

                sueldo = pago * horas;

                if (sueldo > 100000)
                    seguro = sueldo * 0.03;
                else
                    seguro = 0;

                if (nacionalidad == 'V') {

                    if (tipo == 1)
                        v1++;
                    else if (tipo == 2)
                        v2++;
                    else
                        v3++;

                } else if (edad % 2 != 0) {
                    extranjeros++;
                }

                sumaEdad = sumaEdad + edad;
                total = total + sueldo - seguro;

                System.out.println("Sueldo basico: " + sueldo);
                System.out.println("Seguro Social: " + seguro);

                i++;

            } while (i <= m);

            System.out.println("\n--- RESULTADOS ---");

            System.out.println("Venezolanos tipo 1: " + v1);
            System.out.println("Venezolanos tipo 2: " + v2);
            System.out.println("Venezolanos tipo 3: " + v3);
            System.out.println("Extranjeros con edad impar: " + extranjeros);
            System.out.println("Promedio de edad: " + sumaEdad / (double) m);
            System.out.println("Total general a pagar: " + total);
        }
    }

