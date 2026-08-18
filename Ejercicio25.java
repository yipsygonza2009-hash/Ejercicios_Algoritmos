import java.util.Scanner; 

public class Ejercicio25 {

/*
    Ejercicio 25: Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le aplique un aumento del
    15% si su sueldo es inferior a Bs. 40.000 y 12% en caso contrario. Imprima el nuevo sueldo del
    trabajador.
 */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        float sueldo; //  Ingresar el sueldo del trabajador si tiene decimales con la ,    
        float sueltoFinal;

        System.out.print("Ingrese el sueldo: ");
        sueldo = leer.nextFloat();

        if (sueldo < 40000) { // Si el sueldo es menor a 40.000
            sueltoFinal = sueldo + (sueldo * 0.15f); // Aumenta el sueldo en un 15%
        } else {
            sueltoFinal = sueldo + (sueldo * 0.12f); // Aumenta el sueldo en un 12% 
        }

        System.out.println("El sueldo final es: " + sueltoFinal);

        leer.close();
    }
}