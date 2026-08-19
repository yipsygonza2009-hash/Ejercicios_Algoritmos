public class Ejercicio44 {
    
    public static void main(String[] args) {

        double hipoteca;
        double inversionTotal;
        double inversionPersona;
        double inversionSocio;
        double resto;

        System.out.println("Ingrese el monto de la hipoteca:");
        hipoteca = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el monto de la inversion total:");
        inversionTotal = Double.parseDouble(System.console().readLine());

        if (hipoteca < 1000000) {

            inversionPersona = inversionTotal * 50 / 100;
            inversionSocio = inversionTotal * 50 / 100;

        } else {

            inversionPersona = hipoteca;

            resto = inversionTotal - hipoteca;

            inversionPersona = inversionPersona + resto / 2;
            inversionSocio = resto / 2;
        }

        System.out.println("Monto de la hipoteca: $" + hipoteca);
        System.out.println("Inversion total: $" + inversionTotal);
        System.out.println("Cantidad invertida por la persona: $" + inversionPersona);
        System.out.println("Cantidad invertida por el socio: $" + inversionSocio);
    }
}

