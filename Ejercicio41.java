public class Ejercicio41 {
    public static void main(String[] args) {

        int hectareas;
        double metros;
        double areaPino;
        double areaOyamel;
        double areaCedro;
        double pinos;
        double oyameles;
        double cedros;

        System.out.println("Ingrese el numero de hectareas del bosque:");
        hectareas = Integer.parseInt(System.console().readLine());

        metros = hectareas * 10000;

        if (metros > 1000000) {

            areaPino = metros * 70 / 100;
            areaOyamel = metros * 20 / 100;
            areaCedro = metros * 10 / 100;

        } else {

            areaPino = metros * 50 / 100;
            areaOyamel = metros * 30 / 100;
            areaCedro = metros * 20 / 100;
        }

        pinos = areaPino * 8 / 10;
        oyameles = areaOyamel * 15 / 15;
        cedros = areaCedro * 10 / 18;

        System.out.println("Metros cuadrados del bosque: " + metros);
        System.out.println("Numero de pinos: " + pinos);
        System.out.println("Numero de oyameles: " + oyameles);
        System.out.println("Numero de cedros: " + cedros);
    }
} 
    

