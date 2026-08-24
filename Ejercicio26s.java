public class Ejercicio26s {
    
    public static void main(String[] args) {

        int A;
        int B;
        int C;
        int D;
        double resultado;
        int caso;

        A = Integer.parseInt(System.console().readLine("Ingrese A: "));
        B = Integer.parseInt(System.console().readLine("Ingrese B: "));
        C = Integer.parseInt(System.console().readLine("Ingrese C: "));
        D = Integer.parseInt(System.console().readLine("Ingrese D: "));

        if (D == 0) {
            caso = 1;
        } else if (D > 0) {
            caso = 2;
        } else {
            caso = 3;
        }

        switch (caso) {

            case 1:
                resultado = Math.pow(A - C, 2);
                System.out.println("El resultado es: " + resultado);
                break;

            case 2:
                resultado = Math.pow(A - B, 3) / D;
                System.out.println("El resultado es: " + resultado);
                break;

            case 3:
                System.out.println("D debe ser mayor o igual a cero.");
                break;

            default:
                System.out.println("Caso no valido.");
        }
    }
}

