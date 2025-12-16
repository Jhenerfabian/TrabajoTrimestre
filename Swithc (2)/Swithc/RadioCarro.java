import java.util.Scanner;
class RadioCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== RADIO DEL CARRO ===");
        System.out.println("1. Emisora Pop");
        System.out.println("2. Emisora Rock");
        System.out.println("3. Emisora Vallenato");
        System.out.print("Seleccione una emisora (1-3): ");
        int emisora = sc.nextInt();

        System.out.print("Digite la hora (0-23): ");
        int hora = sc.nextInt();

        System.out.println("\n=== RESULTADO ===");

        switch (emisora) {

            case 1: // POP
                System.out.println("Emisora Pop seleccionada");
                if (hora >= 6 && hora < 12) {
                    System.out.println("Programa: Pop de la mañana");
                } else if (hora >= 12 && hora < 18) {
                    System.out.println("Programa: Éxitos del momento");
                } else if (hora >= 18 && hora <= 23) {
                    System.out.println("Programa: Pop noche");
                } else {
                    System.out.println("Hora inválida");
                }
                break;

            case 2: // ROCK
                System.out.println("Emisora Rock seleccionada");
                if (hora >= 6 && hora < 12) {
                    System.out.println("Programa: Rock Clásico");
                } else if (hora >= 12 && hora < 18) {
                    System.out.println("Programa: Rock en español");
                } else if (hora >= 18 && hora <= 23) {
                    System.out.println("Programa: rock pesado");
                } else {
                    System.out.println("Hora inválida");
                }
                break;

            case 3: // VALLENATO
                System.out.println("Emisora Vallenato seleccionada");
                if (hora >= 6 && hora < 12) {
                    System.out.println("Programa: Vallenato tradicional");
                } else if (hora >= 12 && hora < 18) {
                    System.out.println("Programa: Vallenato moderno");
                } else if (hora >= 18 && hora <= 23) {
                    System.out.println("Programa: parrada vallenatera");
                } else {
                    System.out.println("Hora inválida");
                }
                break;

            default:
                System.out.println("Emisora inválida.");
        }

        sc.close();
    }
}
