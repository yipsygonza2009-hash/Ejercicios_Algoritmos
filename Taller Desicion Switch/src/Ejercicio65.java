import java.util.Scanner;

public class Ejercicio65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i = 1;
        String nombre;
        int tipo, hijos, dias;

        double basico;
        double aporteHijos;
        double aporteAsistencia;
        double caja;
        double seguro;
        double neto;

        System.out.println("Cantidad de empleados:");
        n = sc.nextInt();

        do {

            System.out.println("Nombre:");
            nombre = sc.next();

            System.out.println("Tipo (1=Obrero, 2=Administrativo, 3=Ejecutivo):");
            tipo = sc.nextInt();

            System.out.println("Cantidad de hijos:");
            hijos = sc.nextInt();

            System.out.println("Dias de asistencia:");
            dias = sc.nextInt();

            if (tipo == 1)
                basico = 100000;
            else if (tipo == 2)
                basico = 165500;
            else
                basico = 250000;

            if (hijos > 5)
                hijos = 5;

            aporteHijos = basico * 0.10 * hijos;

            if (dias > 28.5)
                aporteAsistencia = basico * 0.05;
            else
                aporteAsistencia = 0;

            caja = basico * 0.10;
            seguro = basico * 0.02;

            neto = basico + aporteHijos + aporteAsistencia - caja - seguro;

            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo basico: " + basico);
            System.out.println("Caja de ahorros: " + caja);
            System.out.println("Seguro social: " + seguro);
            System.out.println("Sueldo neto: " + neto);

            i++;

        } while (i <= n);
    }
}