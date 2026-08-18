
import java.util.Scanner; 


public class Ejercicio26 { 
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int A;
        int B;
        int C;
        int D;
        int resultado;

        System.out.println("Ingrese un dato A: ");
        A = leer.nextInt();

        System.out.println("Ingrese un dato B: ");
        B = leer.nextInt();

        System.out.println("Ingrese un dato C: ");
        C = leer.nextInt();

        System.out.println("Ingrese un dato D: ");
        D = leer.nextInt();


        if (D == 0){
            resultado =(A-C) * (A-C); // Elevado al cuadrado
            System.out.println("El resultado es: " + resultado);
        }else { // Decision anidada para el caso de D positivo
            resultado = ((A-B) * (A-B) * (A-B))/D;
            System.out.println("El resultado es: " + resultado);
        }
    }
}


