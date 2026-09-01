import java.util.Scanner;

public class Ejercicio79 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int autores, autor = 1;
        int totalLibros = 0;
        int cienciaFiccion = 0;
        int romance = 0;
        int mayorCantidad = 0;
        String apellidoMayor = "";

        System.out.print("Cantidad de autores: ");
        autores = teclado.nextInt();

        do {
            teclado.nextLine();

            System.out.print("\nApellido del autor: ");
            String apellido = teclado.nextLine();

            System.out.print("Cantidad de libros: ");
            int libros = teclado.nextInt();

            int libro = 1;
            int totalPaginas = 0;
            int mayorPaginas = 0;
            int codigoMayor = 0;

            do {
                System.out.print("Código del libro: ");
                int codigo = teclado.nextInt();

                System.out.print("Género (1-7): ");
                int genero = teclado.nextInt();

                System.out.print("Número de páginas: ");
                int paginas = teclado.nextInt();

                totalPaginas += paginas;
                totalLibros++;

                if (paginas > mayorPaginas) {
                    mayorPaginas = paginas;
                    codigoMayor = codigo;
                }

                if (genero == 1)
                    cienciaFiccion++;

                if (genero == 2)
                    romance++;

                libro++;

            } while (libro <= libros);

            System.out.println("\nAutor: " + apellido);
            System.out.println("Total de páginas: " + totalPaginas);
            System.out.println("Libro con más páginas: " + codigoMayor);
            System.out.println("Cantidad de páginas: " + mayorPaginas);

            if (libros > mayorCantidad) {
                mayorCantidad = libros;
                apellidoMayor = apellido;
            }

            autor++;

        } while (autor <= autores);

        double porcentaje = (double) cienciaFiccion * 100 / totalLibros;

        System.out.println("\n===== RESULTADOS GENERALES =====");
        System.out.println("Porcentaje de libros de ciencia ficción: "
                + porcentaje + "%");
        System.out.println("Libros de ciencia ficción: " + cienciaFiccion);
        System.out.println("Libros de romance: " + romance);
        System.out.println("Autor con más libros: " + apellidoMayor);
        System.out.println("Cantidad de libros: " + mayorCantidad);

        teclado.close();
    }
}