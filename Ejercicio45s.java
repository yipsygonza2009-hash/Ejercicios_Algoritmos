public class Ejercicio45s {
    
    public static void main(String[] args) {

        double A;
        double B;
        double C;

        double D;
        double X1;
        double X2;

        int caso;

        A = Double.parseDouble(System.console().readLine("Ingrese A: "));
        B = Double.parseDouble(System.console().readLine("Ingrese B: "));
        C = Double.parseDouble(System.console().readLine("Ingrese C: "));

        D = Math.pow(B, 2) - 4 * A * C;

        if (D == 0) {
            caso = 1;
        } else if (D > 0) {
            caso = 2;
        } else {
            caso = 3;
        }

        switch (caso) {

            case 1:

                X1 = -B / (2 * A);
                X2 = X1;

                System.out.println("D = " + D);
                System.out.println("X1 = " + X1);
                System.out.println("X2 = " + X2);

                break;

            case 2:

                X1 = (-B + Math.sqrt(D)) / (2 * A);
                X2 = (-B - Math.sqrt(D)) / (2 * A);

                System.out.println("D = " + D);
                System.out.println("X1 = " + X1);
                System.out.println("X2 = " + X2);

                break;

            case 3:

                System.out.println("D = " + D);
                System.out.println("No tiene soluciones reales.");

                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

