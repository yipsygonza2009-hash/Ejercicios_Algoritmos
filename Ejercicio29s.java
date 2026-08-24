public class Ejercicio29s {
    
    public static void main(String[] args) {

        double ventas1;
        double ventas2;
        double ventas3;
        double salario;
        double totalVentas;
        double limite;

        double salario1;
        double salario2;
        double salario3;

        int caso1;
        int caso2;
        int caso3;

        ventas1 = Double.parseDouble(
            System.console().readLine("Ingrese ventas del departamento 1: ")
        );

        ventas2 = Double.parseDouble(
            System.console().readLine("Ingrese ventas del departamento 2: ")
        );

        ventas3 = Double.parseDouble(
            System.console().readLine("Ingrese ventas del departamento 3: ")
        );

        salario = Double.parseDouble(
            System.console().readLine("Ingrese el salario mensual: ")
        );

        totalVentas = ventas1 + ventas2 + ventas3;
        limite = totalVentas * 0.33;

        if (ventas1 > limite) {
            caso1 = 1;
        } else {
            caso1 = 2;
        }

        if (ventas2 > limite) {
            caso2 = 1;
        } else {
            caso2 = 2;
        }

        if (ventas3 > limite) {
            caso3 = 1;
        } else {
            caso3 = 2;
        }

        switch (caso1) {
            case 1:
                salario1 = salario * 1.20;
                break;

            case 2:
                salario1 = salario;
                break;

            default:
                salario1 = salario;
        }

        switch (caso2) {
            case 1:
                salario2 = salario * 1.20;
                break;

            case 2:
                salario2 = salario;
                break;

            default:
                salario2 = salario;
        }

        switch (caso3) {
            case 1:
                salario3 = salario * 1.20;
                break;

            case 2:
                salario3 = salario;
                break;

            default:
                salario3 = salario;
        }

        System.out.println("Departamento 1: $" + salario1);
        System.out.println("Departamento 2: $" + salario2);
        System.out.println("Departamento 3: $" + salario3);
    }
}

