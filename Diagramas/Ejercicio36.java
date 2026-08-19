public class Ejercicio36 {
    
    public static void main(String []args) {

        int cantidad;
        int resto;

        System.out.println("ingrese la cantidad de bolivares:");
        cantidad=Integer.parseInt(System.console().readLine());

        resto=cantidad;
        System.out.println("Billetes de 50000: " + resto / 50000);
        resto = resto % 50000;

        System.out.println("Billetes de 20000: " + resto / 20000);
        resto = resto % 20000;

        System.out.println("Billetes de 10000: " + resto / 10000);
        resto = resto % 10000;

        System.out.println("Billetes de 5000: " + resto / 5000);
        resto = resto % 5000;

        System.out.println("Billetes de 2000: " + resto / 2000);
        resto = resto % 2000;

        System.out.println("Billetes de 1000: " + resto / 1000);
        resto = resto % 1000;

        System.out.println("Billetes de 500: " + resto / 500);
        resto = resto % 500;

        System.out.println("Billetes de 100: " + resto / 100);
        resto = resto % 100;

        System.out.println("Billetes de 50: " + resto / 50);
        resto = resto % 50;

        System.out.println("Billetes de 20: " + resto / 20);
        resto = resto % 20;

        System.out.println("Billetes de 10: " + resto / 10);
        resto = resto % 10;

    }
}
