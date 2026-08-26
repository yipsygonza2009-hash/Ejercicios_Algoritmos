public class Ejercicio42s {
    
    public static void main(String[] args) {

        int edadMeses;
        int sexo;
        double hemoglobina;
        double minimo;

        int caso;

        edadMeses = Integer.parseInt(
            System.console().readLine("Ingrese edad en meses: ")
        );

        sexo = Integer.parseInt(
            System.console().readLine("Ingrese sexo (1=Mujer, 2=Hombre): ")
        );

        hemoglobina = Double.parseDouble(
            System.console().readLine("Ingrese nivel de hemoglobina: ")
        );

        if (edadMeses <= 1) {
            caso = 1;
        } else if (edadMeses <= 6) {
            caso = 2;
        } else if (edadMeses <= 12) {
            caso = 3;
        } else if (edadMeses <= 60) {
            caso = 4;
        } else if (edadMeses <= 120) {
            caso = 5;
        } else if (edadMeses <= 180) {
            caso = 6;
        } else if (sexo == 1) {
            caso = 7;
        } else {
            caso = 8;
        }

        switch (caso) {

            case 1:
                minimo = 13;
                break;

            case 2:
                minimo = 10;
                break;

            case 3:
                minimo = 11;
                break;

            case 4:
                minimo = 11.5;
                break;

            case 5:
                minimo = 12.6;
                break;

            case 6:
                minimo = 13;
                break;

            case 7:
                minimo = 12;
                break;

            case 8:
                minimo = 14;
                break;

            default:
                minimo = 0;
        }

        if (hemoglobina < minimo) {
            System.out.println("Resultado POSITIVO: tiene anemia.");
        } else {
            System.out.println("Resultado NEGATIVO: no tiene anemia.");
        }
    }
}

