import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombre;
        int horasNormales, horasExtras, hijos;

        double valorHora;
        double sueldoBase;
        double pagoExtras;
        double asignaciones;
        double deducciones;
        double sueldoNeto;

        System.out.print("Nombre: ");
        nombre = leer.nextLine();

        System.out.print("Horas normales: ");
        horasNormales = leer.nextInt();

        System.out.print("Valor hora: ");
        valorHora = leer.nextDouble();

        System.out.print("Horas extras: ");
        horasExtras = leer.nextInt();

        System.out.print("Número de hijos: ");
        hijos = leer.nextInt();

        sueldoBase = horasNormales * valorHora;

        pagoExtras = horasExtras * (valorHora * 1.25);

        asignaciones = 25000 + (17300 * hijos) + 18000;

        deducciones = sueldoBase * (0.05 + 0.02 + 0.07);

        sueldoNeto = sueldoBase + pagoExtras + asignaciones - deducciones;

        System.out.println("Trabajador: " + nombre);
        System.out.println("Asignaciones: " + asignaciones);
        System.out.println("Deducciones: " + deducciones);
        System.out.println("Sueldo Neto: " + sueldoNeto);

        leer.close();
    }
}
