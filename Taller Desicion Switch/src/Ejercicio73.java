import java.util.Scanner;

public class Ejercicio73 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadEstados;
        int estado = 1;

        double sumaMaximosAgencias = 0;
        int totalAgencias = 0;

        System.out.println("Ingrese la cantidad de estados:");
        cantidadEstados = sc.nextInt();

        do {

            int codigoEstado;

            System.out.println("\n--- ESTADO " + estado + " ---");

            System.out.println("Codigo del estado:");
            codigoEstado = sc.nextInt();

            int cantidadAgencias;

            System.out.println("Cantidad de agencias:");
            cantidadAgencias = sc.nextInt();

            int agencia = 1;

            double totalEstado = 0;
            double menorAgencia = 0;
            double mayorAgencia = 0;

            int codigoAgenciaMenor = 0;
            int codigoAgenciaMayor = 0;

            do {

                int codigoAgencia;

                System.out.println("\n--- AGENCIA " + agencia + " ---");

                System.out.println("Codigo de la agencia:");
                codigoAgencia = sc.nextInt();

                int cantidadClientes;

                System.out.println("Cantidad de clientes:");
                cantidadClientes = sc.nextInt();

                int cliente = 1;

                int clientesPendientes = 0;
                double totalAgencia = 0;

                int codigoClienteMayor = 0;
                double mayorDeudaCliente = 0;

                do {

                    int codigoCliente;
                    String nombre;
                    String direccion;

                    System.out.println("\n--- CLIENTE " + cliente + " ---");

                    System.out.println("Codigo del cliente:");
                    codigoCliente = sc.nextInt();

                    System.out.println("Nombre:");
                    nombre = sc.next();

                    System.out.println("Direccion:");
                    direccion = sc.next();

                    int cantidadPagares;

                    System.out.println("Cantidad de pagares:");
                    cantidadPagares = sc.nextInt();

                    int pagare = 1;

                    int pagaresPendientes = 0;
                    double totalCliente = 0;

                    do {

                        int numeroPagare;
                        String fecha;
                        double monto;

                        System.out.println("\n--- PAGARE " + pagare + " ---");

                        System.out.println("Numero del pagare:");
                        numeroPagare = sc.nextInt();

                        System.out.println("Fecha de vencimiento:");
                        fecha = sc.next();

                        System.out.println("Monto del pagare:");
                        monto = sc.nextDouble();

                        System.out.println("¿Esta pendiente? 1=Si / 2=No:");
                        int pendiente = sc.nextInt();

                        if (pendiente == 1) {

                            pagaresPendientes++;
                            totalCliente = totalCliente + monto;

                            System.out.println("\n--- RECIBO ---");
                            System.out.println("Codigo cliente: " + codigoCliente);
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Direccion: " + direccion);
                            System.out.println("Codigo estado: " + codigoEstado);
                            System.out.println("Codigo agencia: " + codigoAgencia);
                            System.out.println("Numero pagare: " + numeroPagare);
                            System.out.println("Fecha vencimiento: " + fecha);
                            System.out.println("Monto: $" + monto);
                        }

                        pagare++;

                    } while (pagare <= cantidadPagares);

                    if (pagaresPendientes > 0) {

                        clientesPendientes++;
                        totalAgencia = totalAgencia + totalCliente;

                        System.out.println("\nPagares pendientes: "
                                + pagaresPendientes);

                        System.out.println("Total pendiente: $"
                                + totalCliente);

                        if (totalCliente > mayorDeudaCliente) {

                            mayorDeudaCliente = totalCliente;
                            codigoClienteMayor = codigoCliente;
                        }
                    }

                    cliente++;

                } while (cliente <= cantidadClientes);

                System.out.println("\n--- RESUMEN DE LA AGENCIA ---");

                System.out.println("Codigo de agencia: "
                        + codigoAgencia);

                System.out.println("Clientes con pagares pendientes: "
                        + clientesPendientes);

                System.out.println("Monto total adeudado: $"
                        + totalAgencia);

                if (clientesPendientes > 0) {

                    System.out.println("Cliente con mayor deuda: "
                            + codigoClienteMayor);
                }

                totalEstado = totalEstado + totalAgencia;

                if (agencia == 1) {

                    menorAgencia = totalAgencia;
                    mayorAgencia = totalAgencia;

                    codigoAgenciaMenor = codigoAgencia;
                    codigoAgenciaMayor = codigoAgencia;

                } else {

                    if (totalAgencia < menorAgencia) {

                        menorAgencia = totalAgencia;
                        codigoAgenciaMenor = codigoAgencia;
                    }

                    if (totalAgencia > mayorAgencia) {

                        mayorAgencia = totalAgencia;
                        codigoAgenciaMayor = codigoAgencia;
                    }
                }

                agencia++;
                totalAgencias++;

            } while (agencia <= cantidadAgencias);

            sumaMaximosAgencias = sumaMaximosAgencias + mayorAgencia;

            System.out.println("\n--- RESUMEN DEL ESTADO ---");

            System.out.println("Codigo del estado: "
                    + codigoEstado);

            System.out.println("Monto total adeudado: $"
                    + totalEstado);

            System.out.println("Agencia con menor deuda: "
                    + codigoAgenciaMenor);

            System.out.println("Agencia con mayor deuda: "
                    + codigoAgenciaMayor);

            estado++;

        } while (estado <= cantidadEstados);

        System.out.println("\n--- RESULTADO NACIONAL ---");

        if (totalAgencias > 0) {

            System.out.println("Promedio de los montos maximos de las agencias: "
                    + sumaMaximosAgencias / totalAgencias);
        }
    }
}