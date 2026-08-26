public class Ejercicio43s {
    
    public static void main(String[] args) {

        double capital;
        double prestamo;
        double nuevoSaldo;

        double insumos;
        double incentivos;
        double presupuestoRestante;

        int caso;

        capital = Double.parseDouble(
            System.console().readLine("Ingrese el capital actual: ")
        );

        if (capital < 0) {
            caso = 1;
        } else if (capital <= 20000) {
            caso = 2;
        } else {
            caso = 3;
        }

        switch (caso) {

            case 1:
                prestamo = 10000 - capital;
                nuevoSaldo = 10000;
                break;

            case 2:
                prestamo = 20000 - capital;
                nuevoSaldo = 20000;
                break;

            case 3:
                prestamo = 0;
                nuevoSaldo = capital;
                break;

            default:
                prestamo = 0;
                nuevoSaldo = capital;
        }

        presupuestoRestante = nuevoSaldo - 5000 - 2000;

        insumos = presupuestoRestante / 2;
        incentivos = presupuestoRestante / 2;

        System.out.println("Dinero para insumos: $" + insumos);
        System.out.println("Dinero para incentivos: $" + incentivos);
        System.out.println("Prestamo bancario: $" + prestamo);
    }
}

