public class Ejercicio37s {
    
    public static void main(String[] args) {

        double A;
        double B;
        double C;

        double mayor;
        double menor1;
        double menor2;

        double S;
        double area;

        int caso;

        A = Double.parseDouble(System.console().readLine("Ingrese lado A: "));
        B = Double.parseDouble(System.console().readLine("Ingrese lado B: "));
        C = Double.parseDouble(System.console().readLine("Ingrese lado C: "));

        if (A >= B && A >= C) {
            mayor = A;
            menor1 = B;
            menor2 = C;
        } else if (B >= A && B >= C) {
            mayor = B;
            menor1 = A;
            menor2 = C;
        } else {
            mayor = C;
            menor1 = A;
            menor2 = B;
        }

        if (menor1 + menor2 <= mayor) {
            caso = 4;
        } else if (A == B && B == C) {
            caso = 1;
        } else if (A == B || A == C || B == C) {
            caso = 2;
        } else {
            caso = 3;
        }

        switch (caso) {

            case 1:
                System.out.println("El triangulo es EQUILATERO.");
                break;

            case 2:
                System.out.println("El triangulo es ISOSCELES.");
                break;

            case 3:
                System.out.println("El triangulo es ESCALENO.");
                break;

            case 4:
                System.out.println("Los datos no forman un triangulo.");
                return;
        }

        S = (A + B + C) / 2;

        area = Math.sqrt(
            S * (S - A) * (S - B) * (S - C)
        );

        System.out.println("El area es: " + area);
    }
}

