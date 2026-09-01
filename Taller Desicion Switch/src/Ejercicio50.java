import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String []args) {

        int numero= 98;
        int suma = 0;
        do{
            suma=suma +numero;
            numero = numero + 2 ;
        } while ( numero <= 1002);
        System.out.println(" la suma de los numero pares es:"+ suma);
    }
}
