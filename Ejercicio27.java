public class Ejercicio27 {
    
    public static void main(String[]args) {

        double valor1;
        double valor2;
        double valor3;
        double areaTriangulo;
        double areaCirculo;
        double areaRectangulo;

        System.out.println("ingrese el valor 1:");
        valor1= Double.parseDouble(System.console().readLine());

        System.out.println("ingrese el valor2:");
        valor2= Double.parseDouble(System.console().readLine());

        System.out.println("ingrese el valor3:");
        valor3= Double.parseDouble(System.console().readLine());

        areaTriangulo= (valor1*valor2)/2;
        if (areaTriangulo== valor3); {
            System.out.println("la figura es un triangulo");
        }

        areaCirculo= 3.14*(valor1*valor1);
        if (areaCirculo== valor3); {
            System.out.println("la figura es un circulo");
        }

        areaRectangulo= valor1*valor2;
        if (areaRectangulo== valor3); {
            System.out.println("la figura es un rectangulo");
        }

    }
}
