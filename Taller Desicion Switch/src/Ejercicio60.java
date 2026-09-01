import java.util.Scanner;

public class Ejercicio60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int factura = 1;
        int dias;
        double monto;
        double interes;
        double descuento;
        double pagar;

        int cantidad;

        System.out.println("Cantidad de facturas:");
        cantidad = sc.nextInt();

        do {

            System.out.println("Numero de factura:");
            factura = sc.nextInt();

            System.out.println("Monto de la factura:");
            monto = sc.nextDouble();

            System.out.println("Dias desde la compra:");
            dias = sc.nextInt();

            interes = 0;
            descuento = 0;

            if (dias >= 60)
                interes = monto * 0.08;
            else if (dias >= 31)
                interes = monto * 0.06;
            else if (dias < 15)
                descuento = monto * 0.02;

            pagar = monto + interes - descuento;

            System.out.println("Monto de interes: " + interes);
            System.out.println("Monto descontado: " + descuento);
            System.out.println("Monto a cancelar: " + pagar);

            factura++;

        } while (factura <= cantidad);
    }
}
