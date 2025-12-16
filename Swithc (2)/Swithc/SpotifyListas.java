import java.util.Scanner;
public class SpotifyListas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SPOTIFY - LISTAS DE REPRODUCCIÓN ===");
        System.out.println("1. Lista \"Estudio\"");
        System.out.println("2. Lista \"Entrenamiento\"");
        System.out.println("3. Lista \"Fiesta\"");
        System.out.print("Seleccione una lista (1-3): ");
        int lista =scanner.nextInt();

        System.out.print("Seleccione el tipo (1 = corta, 2 = larga): ");
        int tipo = scanner.nextInt();

        System.out.println("\n=== RESULTADO ===");

        switch (lista) {

            case 1: // ESTUDIO
                System.out.println("Lista seleccionada: Estudio");

                if (tipo == 1) {
                    System.out.println("Tipo: Versión corta");
                    System.out.println("Canciones: 10");
                    System.out.println("Duración estimada: 30 min");
                } else if (tipo == 2) {
                    System.out.println("Tipo: Versión larga");
                    System.out.println("Canciones: 25");
                    System.out.println("Duración estimada: 1h 15 min");
                } else {
                    System.out.println("Error: Tipo de lista no válido.");
                }
                break;

            case 2: // ENTRENAMIENTO
                System.out.println("Lista seleccionada: Entrenamiento");

                if (tipo == 1) {
                    System.out.println("Tipo: Versión corta");
                    System.out.println("Canciones: 12");
                    System.out.println("Duración estimada: 35 min");
                } else if (tipo == 2) {
                    System.out.println("Tipo: Versión larga");
                    System.out.println("Canciones: 28");
                    System.out.println("Duración estimada: 1h 20 min");
                } else {
                    System.out.println("Error: Tipo de lista no válido.");
                }
                break;

            case 3: // FIESTA
                System.out.println("Lista seleccionada: Fiesta");

                if (tipo == 1) {
                    System.out.println("Tipo: Versión corta");
                    System.out.println("Canciones: 15");
                    System.out.println("Duración estimada: 40 min");
                } else if (tipo == 2) {
                    System.out.println("Tipo: Versión larga");
                    System.out.println("Canciones: 30");
                    System.out.println("Duración estimada: 1h 30 min");
                } else {
                    System.out.println("Error: Tipo de lista no válido.");
                }
                break;

            default:
                System.out.println("Error: Lista seleccionada no válida.");
        }

        scanner.close();
    }
}
