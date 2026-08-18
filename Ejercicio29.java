public class Ejercicio29 {
    public static void main(String [] args) {

        double venta1;
        double venta2;
        double venta3;
        double salario;
        double ventasTotales;
        double limite;
        double pago1;
        double pago2;
        double pago3;

        System.out.println("ingrese las ventas del departamento 1:");
        venta1 = Double.parseDouble(System.console().readLine()); 

        System.out.println("ingrese las ventas del departamento 2:");
        venta2 = Double.parseDouble(System.console().readLine()); 

        System.out.println("ingrese las ventas del departamento 3:");
        venta3 = Double.parseDouble(System.console().readLine()); 

        System.out.println("ingrese el salario mensual:");
        salario = Double.parseDouble(System.console().readLine());

        ventasTotales = venta1 + venta2 + venta3;
        
        limite = ventasTotales * 33 / 100;

        if (venta1 > limite) {
            pago1 = salario + (salario * 20 / 100);

        } else {
            pago1 = salario;
        }

        if (venta2 > limite) {
            pago2 = salario + (salario * 20 / 100);

        } else {
            pago2 = salario;
        }

        if (venta3 > limite) {
            pago3 = salario + (salario * 20 / 100);

        } else {
            pago3 = salario;
        }

        System.out.println(" el departamento 1 recibira un pago de: $" + pago1);
        System.out.println(" el departamento 2 recibira un pago de: $" + pago2);
        System.out.println(" el departamento 3 recibira un pago de: $" + pago3);
        

    }
}
