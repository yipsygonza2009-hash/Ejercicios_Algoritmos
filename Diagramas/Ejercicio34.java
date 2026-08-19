public class Ejercicio34 {
    
    public static void main( String[] args) {

        int categoria;
        double sueldo;
        double aumento;
        double nuevoSueldo;

        System.out.println("Ingrese la categoria del trabajador:");
        categoria = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el sueldo del trabajador:");
        sueldo = Double.parseDouble(System.console().readLine());

        if (categoria == 1) {
            aumento = sueldo * 15 / 100;

        } else if (categoria == 2) {
            aumento = sueldo * 10 / 100;

        } else if (categoria == 3) {
            aumento = sueldo * 8 / 100;

        } else {
            aumento = sueldo * 7 / 100;
        }

        nuevoSueldo = sueldo + aumento;

        System.out.println("Categoria: " + categoria);
        System.out.println("Nuevo sueldo: $" + nuevoSueldo);
    }
}
