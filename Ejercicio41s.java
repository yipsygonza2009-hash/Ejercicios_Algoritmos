public class Ejercicio41s {
    
    public static void main(String[] args) {

        double hectareas;
        double metros;

        double areaPino;
        double areaOyamel;
        double areaCedro;

        double pinos;
        double oyameles;
        double cedros;

        int caso;

        hectareas = Double.parseDouble(
            System.console().readLine("Ingrese cantidad de hectareas: ")
        );

        metros = hectareas * 10000;

        if (metros > 1000000) {
            caso = 1;
        } else {
            caso = 2;
        }

        switch (caso) {

            case 1:
                areaPino = metros * 0.70;
                areaOyamel = metros * 0.20;
                areaCedro = metros * 0.10;
                break;

            case 2:
                areaPino = metros * 0.50;
                areaOyamel = metros * 0.30;
                areaCedro = metros * 0.20;
                break;

            default:
                areaPino = 0;
                areaOyamel = 0;
                areaCedro = 0;
        }

        pinos = areaPino / 10 * 8;
        oyameles = areaOyamel / 15 * 15;
        cedros = areaCedro / 18 * 10;

        System.out.println("Cantidad de pinos: " + pinos);
        System.out.println("Cantidad de oyameles: " + oyameles);
        System.out.println("Cantidad de cedros: " + cedros);
    }
}

