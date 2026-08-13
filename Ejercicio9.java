import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double horas, valorHora;
        double salarioBase, descuento, salarioNeto;

        System.out.print("Horas trabajadas: ");
        horas = leer.nextDouble();

        System.out.print("Valor de la hora: ");
        valorHora = leer.nextDouble();

        salarioBase = horas * valorHora;
        descuento = salarioBase * 0.20;
        salarioNeto = salarioBase - descuento;

        System.out.println("Salario Base: $" + salarioBase);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Salario Neto: $" + salarioNeto);

        leer.close();
    }
}
    
