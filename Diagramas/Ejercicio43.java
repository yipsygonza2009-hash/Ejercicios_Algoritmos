public class Ejercicio43 {
    public static void main(String[] args) {

        double capital;
        double prestamo = 0;
        double nuevoCapital;
        double resto;
        double insumos;
        double incentivos;

        System.out.println("Ingrese el capital actual:");
        capital = Double.parseDouble(System.console().readLine());

        if (capital < 0) {

            prestamo = 10000 - capital;
            nuevoCapital = 10000;

        } else if (capital <= 20000) {

            prestamo = 20000 - capital;
            nuevoCapital = 20000;

        } else {

            nuevoCapital = capital;
        }

        resto = nuevoCapital - 5000 - 2000;

        insumos = resto / 2;
        incentivos = resto / 2;

        System.out.println("Cantidad para equipo de computo: $5000");
        System.out.println("Cantidad para mobiliario: $2000");
        System.out.println("Cantidad para insumos: $" + insumos);
        System.out.println("Cantidad para incentivos: $" + incentivos);
        System.out.println("Prestamo bancario: $" + prestamo);
    }
} 
