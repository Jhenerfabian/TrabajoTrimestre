import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AgregarNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;
        int mayores50 = 0;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");

            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Ingrese un número entero: ");
                sc.next();
            }

            numeros.add(sc.nextInt());
        }

        System.out.println("\nNúmeros pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        for (int num : numeros) {
            suma += num;
        }
        System.out.println("\nSuma de todos los elementos: " + suma);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("\nLista ordenada de forma descendente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : numeros) {
            if (num > 50) {
                mayores50++;
            }
        }
        System.out.println("\nCantidad de números mayores que 50: " + mayores50);
    }
}