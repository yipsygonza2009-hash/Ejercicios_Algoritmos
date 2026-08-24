public class Ejercicio36s {
    
    public static void main(String[] args) {

        int cantidad;
        int caso;

        cantidad = Integer.parseInt(
            System.console().readLine("Ingrese la cantidad de Bolivares: ")
        );

        caso = 1;

        switch (caso) {

            case 1:

                int b50000 = cantidad / 50000;
                cantidad = cantidad % 50000;

                int b20000 = cantidad / 20000;
                cantidad = cantidad % 20000;

                int b10000 = cantidad / 10000;
                cantidad = cantidad % 10000;

                int b5000 = cantidad / 5000;
                cantidad = cantidad % 5000;

                int b2000 = cantidad / 2000;
                cantidad = cantidad % 2000;

                int b1000 = cantidad / 1000;
                cantidad = cantidad % 1000;

                int b500 = cantidad / 500;
                cantidad = cantidad % 500;

                int b100 = cantidad / 100;
                cantidad = cantidad % 100;

                int b50 = cantidad / 50;
                cantidad = cantidad % 50;

                int b20 = cantidad / 20;
                cantidad = cantidad % 20;

                int b10 = cantidad / 10;

                System.out.println("Billetes de 50000: " + b50000);
                System.out.println("Billetes de 20000: " + b20000);
                System.out.println("Billetes de 10000: " + b10000);
                System.out.println("Billetes de 5000: " + b5000);
                System.out.println("Billetes de 2000: " + b2000);
                System.out.println("Billetes de 1000: " + b1000);
                System.out.println("Billetes de 500: " + b500);
                System.out.println("Billetes de 100: " + b100);
                System.out.println("Billetes de 50: " + b50);
                System.out.println("Billetes de 20: " + b20);
                System.out.println("Billetes de 10: " + b10);

                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

