public class Ejercicio34s {
    
    public static void main(String[] args) {

        int categoria;
        double sueldo;
        double aumento;
        double nuevoSueldo;

        categoria = Integer.parseInt(
            System.console().readLine("Ingrese la categoria: ")
        );

        sueldo = Double.parseDouble(
            System.console().readLine("Ingrese el sueldo: ")
        );

        switch (categoria) {

            case 1:
                aumento = sueldo * 0.15;
                break;

            case 2:
                aumento = sueldo * 0.10;
                break;

            case 3:
                aumento = sueldo * 0.08;
                break;

            case 4:
                aumento = sueldo * 0.07;
                break;

            default:
                System.out.println("Categoria no valida.");
                return;
        }

        nuevoSueldo = sueldo + aumento;

        System.out.println("Categoria: " + categoria);
        System.out.println("Nuevo sueldo: $" + nuevoSueldo);
    }
}

