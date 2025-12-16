import java.util.Scanner;
public class ContarParesImpares {

    public static void contarParesImpares() {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");


            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Ingrese un número entero: ");
                sc.next();
            }

            numero = sc.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

        } while (numero != 0);

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }

    public static void main(String[] args) {
        contarParesImpares();
    }
}