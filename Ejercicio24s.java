public class Ejercicio24s {
    
    public static void main(String[] args) {

        int inversion;
        int tasa;
        int intereses;
        int total;
        int caso;

        inversion = Integer.parseInt(
            System.console().readLine("Ingrese la cantidad de dinero invertida: ")
        );

        tasa = Integer.parseInt(
            System.console().readLine("Ingrese la tasa de interes (%): ")
        );

        intereses = inversion * tasa / 100;

        if (intereses > 7000) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                total = inversion + intereses;

                System.out.println("Los intereses generados son: $" + intereses);
                System.out.println("Los intereses se reinvierten.");
                System.out.println("El dinero final en la cuenta es: $" + total);
                break;

            case 2:
                total = inversion;

                System.out.println("Los intereses generados son: $" + intereses);
                System.out.println("Los intereses no se reinvierten.");
                System.out.println("El dinero final en la cuenta es: $" + total);
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

