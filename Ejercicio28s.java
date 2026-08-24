public class Ejercicio28s {
    
    public static void main(String[] args) {

        double monto;
        double inversion;
        double banco;
        double credito;
        double intereses;

        int caso;

        monto = Double.parseDouble(
            System.console().readLine("Ingrese el monto total de la compra: ")
        );

        if (monto > 500000) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                inversion = monto * 0.55;
                banco = monto * 0.30;
                credito = monto * 0.15;

                intereses = credito * 0.20;

                System.out.println("Fondos de la empresa: $" + inversion);
                System.out.println("Prestamo del banco: $" + banco);
                System.out.println("Credito del fabricante: $" + credito);
                System.out.println("Intereses: $" + intereses);
                break;

            case 2:
                inversion = monto * 0.70;
                banco = 0;
                credito = monto * 0.30;

                intereses = credito * 0.20;

                System.out.println("Fondos de la empresa: $" + inversion);
                System.out.println("Prestamo del banco: $" + banco);
                System.out.println("Credito del fabricante: $" + credito);
                System.out.println("Intereses: $" + intereses);
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

