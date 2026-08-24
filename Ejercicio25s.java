public class Ejercicio25s {
    
    public static void main(String[] args) {

        double sueldo;
        double aumento;
        double nuevoSueldo;
        int caso;

        sueldo = Double.parseDouble(
            System.console().readLine("Ingrese el sueldo: ")
        );

        if (sueldo < 40000) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                aumento = sueldo * 0.15;
                nuevoSueldo = sueldo + aumento;

                System.out.println("Aumento del 15%");
                System.out.println("Nuevo sueldo: $" + nuevoSueldo);
                break;

            case 2:
                aumento = sueldo * 0.12;
                nuevoSueldo = sueldo + aumento;

                System.out.println("Aumento del 12%");
                System.out.println("Nuevo sueldo: $" + nuevoSueldo);
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

