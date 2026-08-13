import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

    Scanner Leer = new Scanner(System.in);

double sueldoBase;
double venta1, venta2 ,venta3;
double totalVentas;
double comision; 
double sueldoTotal;

System.out.println("=== CALCULO DE COMISIONES ===");

System.out.print("INGRESE EL SUELDO BASE");
sueldoBase= Leer.nextDouble();

System.out.print("INGRESE EL VALOR DE LA PRIMERA VENTA");
venta1= Leer.nextDouble();

System.out.print("INGRESE EL VALOR DE LA SEGUNDA VENTA");
venta2= Leer.nextDouble();

System.out.print("INGRESE EL VALOR DE LA TERCERA VENTA");
venta3= Leer.nextDouble();

totalVentas= venta1 + venta2 + venta3;

comision=totalVentas * 0.10;

sueldoTotal= sueldoBase + comision;

System.out.println("\nRESULTADOS");
System.out.println("Total de ventas: $"+totalVentas);
System.out.println("Comision: $" +comision);
System.out.println("Sueldo total: $" +sueldoTotal);

Leer.close();
    }
}