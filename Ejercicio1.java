import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        double edad1, edad2, edad3; // Variables para almacenar las edades ingresadas
        double promedio; // Variable para almacenar el promedio de las edades       

        System.out.println("=== PROMEDIO DE TRES EDADES ==="); // Mensaje de bienvenida

        System.out.print("Ingrese la primera edad: "); // Solicitar al usuario que ingrese la primera edad
        edad1 = leer.nextDouble(); // Leer la primera edad ingresada por el usuario

        System.out.print("Ingrese la segunda edad: "); // Solicitar al usuario que ingrese la segunda edad
        edad2 = leer.nextDouble(); // Leer la segunda edad ingresada por el usuario

        System.out.print("Ingrese la tercera edad: "); //   
        edad3 = leer.nextDouble(); // Leer la tercera edad ingresada por el usuario

        promedio = (edad1 + edad2 + edad3) / 3; // Calcular el promedio de las edades ingresadas

        System.out.println("El promedio es: " + promedio); // Mostrar el promedio calculado al usuario

        leer.close(); // Cerrar el objeto Scanner para liberar recursos
    }
}