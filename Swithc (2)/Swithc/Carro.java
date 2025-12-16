import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("1. desea encender o apagar la luz ");
        System.out.println("2. ajuste la velocidad acelerar/ frenar ");
        System.out.println("3. ajuste el modo de conduccion normal/eco/sport ");
        opcion = sc.nextInt();
        sc.nextLine();


        switch (opcion) {

            case 1:
                System.out.println("¿Desea encenderlas o apagarlas?");
                String luz = sc.nextLine().toLowerCase();

                if (luz.equals("encender") || luz.equals("encenderlas")) {
                    System.out.println("Luces encendidas");
                } else if (luz.equals("apagar") || luz.equals("apagarlas")) {
                    System.out.println("Luces apagadas");
                } else {
                    System.out.println("Opción no válida");
                }
                break;

            case 2:
                System.out.println("¿Desea acelerar, mantener la velocidad o frenar?");
                String velocidad = sc.nextLine().toLowerCase();

                if (velocidad.equals("acelerar")) {
                    System.out.println("Acelerando...");
                } else if (velocidad.equals("mantener la velocidad") || velocidad.equals("mantener")) {
                    System.out.println("Velocidad estable.");
                } else if (velocidad.equals("frenar")) {
                    System.out.println("Frenando...");
                } else {
                    System.out.println("Opción no válida");
                }
                break;


            case 3:
                System.out.println("Seleccione modo de conducción:");
                System.out.println("1. Normal");
                System.out.println("2. Eco");
                System.out.println("3. Sport");
                int modo = sc.nextInt();

                if (modo == 1) {
                    System.out.println("Modo Normal activado.");
                } else if (modo == 2) {
                    System.out.println("Modo Eco activado.");
                } else if (modo == 3) {
                    System.out.println("Modo Sport activado.");
                } else {
                    System.out.println("Modo no válido.");
                }
                break;

            default:
                System.out.println("Opción inválida");

        }
    }
}
