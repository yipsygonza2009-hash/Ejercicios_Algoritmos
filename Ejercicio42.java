public class Ejercicio42 {
    public static void main(String[] args) {

        int edad;
        double hemoglobina;
        String sexo;

        System.out.println("Ingrese la edad en meses:");
        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el nivel de hemoglobina:");
        hemoglobina = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el sexo (M = mujer, H = hombre):");
        sexo = System.console().readLine();

        if (edad <= 1) {

            if (hemoglobina < 13) {
                System.out.println("Resultado positivo: tiene anemia.");
            } else {
                System.out.println("Resultado negativo: no tiene anemia.");
            }

        } else if (edad <= 6) {

            if (hemoglobina < 10) {
                System.out.println("Resultado positivo: tiene anemia.");
            } else {
                System.out.println("Resultado negativo: no tiene anemia.");
            }

        } else if (edad <= 12) {

            if (hemoglobina < 11) {
                System.out.println("Resultado positivo: tiene anemia.");
            } else {
                System.out.println("Resultado negativo: no tiene anemia.");
            }

        } else if (edad <= 60) {

            if (hemoglobina < 11.5) {
                System.out.println("Resultado positivo: tiene anemia.");
            } else {
                System.out.println("Resultado negativo: no tiene anemia.");
            }

        } else if (edad <= 120) {

            if (hemoglobina < 12.6) {
                System.out.println("Resultado positivo: tiene anemia.");
            } else {
                System.out.println("Resultado negativo: no tiene anemia.");
            }

        } else if (edad <= 180) {

            if (hemoglobina < 13) {
                System.out.println("Resultado positivo: tiene anemia.");
            } else {
                System.out.println("Resultado negativo: no tiene anemia.");
            }

        } else {

            if (sexo.equalsIgnoreCase("M")) {

                if (hemoglobina < 12) {
                    System.out.println("Resultado positivo: tiene anemia.");
                } else {
                    System.out.println("Resultado negativo: no tiene anemia.");
                }

            } else if (sexo.equalsIgnoreCase("H")) {

                if (hemoglobina < 14) {
                    System.out.println("Resultado positivo: tiene anemia.");
                } else {
                    System.out.println("Resultado negativo: no tiene anemia.");
                }

            } else {
                System.out.println("Sexo no valido.");
            }
        }
    }
}

