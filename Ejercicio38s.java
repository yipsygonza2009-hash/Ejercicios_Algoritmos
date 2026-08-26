public class Ejercicio38s {
    
    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;
        int edad;

        dia = Integer.parseInt(
            System.console().readLine("Ingrese dia de nacimiento: ")
        );

        mes = Integer.parseInt(
            System.console().readLine("Ingrese mes de nacimiento: ")
        );

        anio = Integer.parseInt(
            System.console().readLine("Ingrese año de nacimiento: ")
        );

        edad = 2026 - anio;

        switch (mes) {

            case 1:
                if (dia <= 20) {
                    System.out.println("Signo: Capricornio");
                } else {
                    System.out.println("Signo: Acuario");
                }
                break;

            case 2:
                if (dia <= 19) {
                    System.out.println("Signo: Acuario");
                } else {
                    System.out.println("Signo: Piscis");
                }
                break;

            case 3:
                if (dia <= 20) {
                    System.out.println("Signo: Piscis");
                } else {
                    System.out.println("Signo: Aries");
                }
                break;

            case 4:
                if (dia <= 20) {
                    System.out.println("Signo: Aries");
                } else {
                    System.out.println("Signo: Tauro");
                }
                break;

            case 5:
                if (dia <= 21) {
                    System.out.println("Signo: Tauro");
                } else {
                    System.out.println("Signo: Geminis");
                }
                break;

            case 6:
                if (dia <= 21) {
                    System.out.println("Signo: Geminis");
                } else {
                    System.out.println("Signo: Cancer");
                }
                break;

            case 7:
                if (dia <= 22) {
                    System.out.println("Signo: Cancer");
                } else {
                    System.out.println("Signo: Leo");
                }
                break;

            case 8:
                if (dia <= 23) {
                    System.out.println("Signo: Leo");
                } else {
                    System.out.println("Signo: Virgo");
                }
                break;

            case 9:
                if (dia <= 22) {
                    System.out.println("Signo: Virgo");
                } else {
                    System.out.println("Signo: Libra");
                }
                break;

            case 10:
                if (dia <= 22) {
                    System.out.println("Signo: Libra");
                } else {
                    System.out.println("Signo: Escorpion");
                }
                break;

            case 11:
                if (dia <= 21) {
                    System.out.println("Signo: Escorpion");
                } else {
                    System.out.println("Signo: Sagitario");
                }
                break;

            case 12:
                if (dia <= 21) {
                    System.out.println("Signo: Sagitario");
                } else {
                    System.out.println("Signo: Capricornio");
                }
                break;

            default:
                System.out.println("Mes no valido.");
        }

        System.out.println("Edad: " + edad + " años");
    }
}

