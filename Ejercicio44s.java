public class Ejercicio44s {
    
    public static void main(String[] args) {

        double hipoteca;
        double inversionTotal;

        double aportePersona;
        double aporteSocio;
        double resto;

        int caso;

        hipoteca = Double.parseDouble(
            System.console().readLine("Ingrese monto de la hipoteca: ")
        );

        inversionTotal = Double.parseDouble(
            System.console().readLine("Ingrese inversion total necesaria: ")
        );

        if (hipoteca < 1000000) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                aportePersona = inversionTotal * 0.50;
                aporteSocio = inversionTotal * 0.50;
                break;

            case 2:
                aportePersona = hipoteca;

                resto = inversionTotal - hipoteca;

                aportePersona = aportePersona + resto / 2;
                aporteSocio = resto / 2;
                break;

            default:
                aportePersona = 0;
                aporteSocio = 0;
        }

        System.out.println("Aporte de la persona: $" + aportePersona);
        System.out.println("Aporte del socio: $" + aporteSocio);
    }
}

