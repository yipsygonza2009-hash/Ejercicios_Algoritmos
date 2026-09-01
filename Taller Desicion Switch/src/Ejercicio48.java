import java.util.Scanner;
public class Ejercicio48 {

    public static void main(String []args) {

        int f=28;
        int limite=54;

        double c;
        double k;
        double r;

        System.out.println("Fahrenheit\tCelsius\t\tKelvin\t\tRankine");
        do{
            c=5*(f-32)/9.0;
            r=f+459.67;
            k=c+273.15;

            System.out.println(f + "t\t" +c+ "t\t" +k+ "t\t" +r);
            f++;
        } while(f<=limite);
    }
}
