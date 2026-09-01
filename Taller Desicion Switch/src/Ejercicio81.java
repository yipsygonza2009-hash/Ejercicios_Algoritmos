import java.util.Scanner;

public class Ejercicio81 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int estados;

        System.out.println("Cantidad de estados:");
        estados = sc.nextInt();

        int estado = 1;

        do {

            System.out.println("Codigo del estado:");
            int codigoEstado = sc.nextInt();

            System.out.println("Nombre del estado:");
            String nombreEstado = sc.next();

            System.out.println("Cantidad de ciudades:");
            int ciudades = sc.nextInt();

            int ciudad = 1;

            do {

                System.out.println("Codigo de ciudad:");
                int codigoCiudad = sc.nextInt();

                System.out.println("Nombre de ciudad:");
                String nombreCiudad = sc.next();

                System.out.println("Cantidad esperada:");
                int esperada = sc.nextInt();

                System.out.println("Cantidad de vendedores:");
                int vendedores = sc.nextInt();

                int vendedor = 1;

                int unidadesTotales = 0;
                double ventaBruta = 0;
                double comisionTienda = 0;
                double comisionCalle = 0;

                do {

                    System.out.println("Codigo del vendedor:");
                    int codigoVendedor = sc.nextInt();

                    System.out.println("Unidades vendidas:");
                    int unidades = sc.nextInt();

                    System.out.println("Monto vendido:");
                    double monto = sc.nextDouble();

                    unidadesTotales += unidades;
                    ventaBruta += monto;

                    if (codigoVendedor / 1000 == 11)
                        comisionTienda += monto * 0.10;
                    else
                        comisionCalle += monto * 0.15;

                    vendedor++;

                } while (vendedor <= vendedores);

                System.out.println("Codigo ciudad: " + codigoCiudad);
                System.out.println("Nombre: " + nombreCiudad);
                System.out.println("Unidades vendidas: " + unidadesTotales);
                System.out.println("Venta bruta: " + ventaBruta);
                System.out.println("Comision tienda: " + comisionTienda);
                System.out.println("Comision calle: " + comisionCalle);

                ciudad++;

            } while (ciudad <= ciudades);

            estado++;

        } while (estado <= estados);
    }
}