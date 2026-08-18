public class ejercicio24 {
    
    public static void main( String[]args) {

        int inversion;
        int tasa;
        int intereses;
        int total;

        System.out.println("Ingrese la cantidad de dinero invertida: ");
        inversion=
        Integer.parseInt(System.console().readLine());

        System.out.println("ingrese la tasa de interese (%): ");
        tasa=
        Integer.parseInt(System.console().readLine());

        intereses=inversion*tasa/100;
        if(intereses > 7000) {
            total=inversion + intereses;
    System.out.println("los ingrsos no exceden los 7000");
        }else{
            total=inversion;
            System.out.println("los intereses exceden los 7000");
        }
            System.out.println("los intereses generados son: $"+ intereses);
            System.out.println("el dinero final en la cuent es: $"+ total);

        

    }

}
