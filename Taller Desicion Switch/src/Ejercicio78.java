import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final int PVP1 = 10000;
        final int PVP2 = 15000;
        final int PVP3 = 20000;

        int cantidadSucursales, sucursal = 1, alcanzadas = 0;

        System.out.print("Cantidad de sucursales: ");
        cantidadSucursales = teclado.nextInt();

        do {
            System.out.print("\nCódigo de sucursal: ");
            int codigoSucursal = teclado.nextInt();

            System.out.print("Monto esperado: ");
            int montoEsperado = teclado.nextInt();

            System.out.print("Cantidad de puntos de venta: ");
            int cantidadPuntos = teclado.nextInt();

            int punto = 1;
            int totalSucursal = 0;
            int mayorComision = 0;
            int codigoMayor = 0;

            do {
                System.out.print("\nCódigo del punto de venta: ");
                int codigoPunto = teclado.nextInt();

                System.out.print("Vendedores: ");
                int vendedores = teclado.nextInt();

                System.out.print("Unidades producto 1: ");
                int u1 = teclado.nextInt();

                System.out.print("Unidades producto 2: ");
                int u2 = teclado.nextInt();

                System.out.print("Unidades producto 3: ");
                int u3 = teclado.nextInt();

                int ventaBruta = u1 * PVP1 + u2 * PVP2 + u3 * PVP3;
                int comision = ventaBruta * 10 / 100;
                int ventaNeta = ventaBruta - comision;

                int menor;

                if (u1 <= u2 && u1 <= u3)
                    menor = 1;
                else if (u2 <= u1 && u2 <= u3)
                    menor = 2;
                else
                    menor = 3;

                System.out.println("Venta neta: $" + ventaNeta);
                System.out.println("Comisión: $" + comision);
                System.out.println("Producto con menos unidades: " + menor);
                System.out.println("Comisión por vendedor: $" + comision / vendedores);

                totalSucursal += ventaNeta;

                if (comision > mayorComision) {
                    mayorComision = comision;
                    codigoMayor = codigoPunto;
                }

                punto++;

            } while (punto <= cantidadPuntos);

            double porcentaje = (double) totalSucursal * 100 / montoEsperado;

            System.out.println("\nSucursal: " + codigoSucursal);
            System.out.println("Total vendido: $" + totalSucursal);
            System.out.println("Porcentaje alcanzado: " + porcentaje + "%");
            System.out.println("Punto con mayor comisión: " + codigoMayor);
            System.out.println("Mayor comisión: $" + mayorComision);

            if (totalSucursal >= montoEsperado)
                alcanzadas++;

            sucursal++;

        } while (sucursal <= cantidadSucursales);

        System.out.println("\nPorcentaje de sucursales que alcanzaron la meta: "
                + (double) alcanzadas * 100 / cantidadSucursales + "%");

        teclado.close();
    }
}