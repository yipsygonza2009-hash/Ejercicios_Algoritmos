public class Ejercicio28 {
    
    public static void main(String[]args) {

        double compra;
        double fondosEmpresa;
        double creditoFabricante;
        double intereses;
        double prestamoBanco;

        System.out.println("Ingrese el monto total de la compra:");
        compra = Double.parseDouble(System.console().readLine());

        if (compra > 500000) {

            fondosEmpresa = compra * 55 / 100;
            prestamoBanco = compra * 30 / 100;
            creditoFabricante = compra * 15 / 100;

        } else {

            fondosEmpresa = compra * 70 / 100;
            prestamoBanco = 0;
            creditoFabricante = compra * 30 / 100;
        }

        intereses = creditoFabricante * 20 / 100;

        System.out.println("Fondos de la empresa: $" + fondosEmpresa);
        System.out.println("Credito del fabricante: $" + creditoFabricante);
        System.out.println("Intereses: $" + intereses);

        if (prestamoBanco > 0) {
            System.out.println("Prestamo del banco: $" + prestamoBanco);

            
        }
    }
}
    

