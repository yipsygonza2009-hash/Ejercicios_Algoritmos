public class Ejercicio38 {
    public static void main(String[] args) {

        int dia;
        int mes;
        int año;
        int edad;
        String signo;

        System.out.println("Ingrese el dia de nacimiento:");
        dia = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el mes de nacimiento:");
        mes = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el año de nacimiento:");
        año = Integer.parseInt(System.console().readLine());

        edad = 2026 - año;

        if (mes == 1 && dia <= 20) {
            signo = "Capricornio";

        } else if (mes == 1 && dia >= 21) {
            signo = "Acuario";

        } else if (mes == 2 && dia <= 19) {
            signo = "Acuario";

        } else if (mes == 2 && dia >= 20) {
            signo = "Piscis";

        } else if (mes == 3 && dia <= 20) {
            signo = "Piscis";

        } else if (mes == 3 && dia >= 21) {
            signo = "Aries";

        } else if (mes == 4 && dia <= 20) {
            signo = "Aries";

        } else if (mes == 4 && dia >= 21) {
            signo = "Tauro";

        } else if (mes == 5 && dia <= 21) {
            signo = "Tauro";

        } else if (mes == 5 && dia >= 22) {
            signo = "Geminis";

        } else if (mes == 6 && dia <= 21) {
            signo = "Geminis";

        } else if (mes == 6 && dia >= 22) {
            signo = "Cancer";

        } else if (mes == 7 && dia <= 22) {
            signo = "Cancer";

        } else if (mes == 7 && dia >= 23) {
            signo = "Leo";

        } else if (mes == 8 && dia <= 23) {
            signo = "Leo";

        } else if (mes == 8 && dia >= 24) {
            signo = "Virgo";

        } else if (mes == 9 && dia <= 22) {
            signo = "Virgo";

        } else if (mes == 9 && dia >= 23) {
            signo = "Libra";

        } else if (mes == 10 && dia <= 22) {
            signo = "Libra";

        } else if (mes == 10 && dia >= 23) {
            signo = "Escorpion";

        } else if (mes == 11 && dia <= 21) {
            signo = "Escorpion";

        } else if (mes == 11 && dia >= 22) {
            signo = "Sagitario";

        } else if (mes == 12 && dia <= 21) {
            signo = "Sagitario";

        } else if (mes == 12 && dia >= 22) {
            signo = "Capricornio";

        } else {
            signo = "Fecha no valida";
        }

        System.out.println("Signo zodiacal: " + signo);
        System.out.println("Edad: " + edad + " años");
    }
}