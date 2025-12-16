import java.util.Scanner;
public class TablaMultiplicar {

    public static void generarTabla(int numero, int limite) {
        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, lim;

        // Validar número para la tabla
        System.out.print("Ingrese el número para la tabla: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            sc.next();
        }
        num = sc.nextInt();

        // Validar límite
        System.out.print("¿Hasta qué número quiere la tabla?: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            sc.next();
        }
        lim = sc.nextInt();

        generarTabla(num, lim);
    }
}