import java.util.Scanner;
public class ClasificarEdad {

    public static String clasificarEdad(int edad) {

        if (edad >= 0 && edad <= 12) {
            return "Niño";
        } else if (edad >= 13 && edad <= 17) {
            return "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            return "Adulto";
        } else if (edad >= 60) {
            return "Adulto Mayor";
        } else {
            return "Edad inválida";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        // Validación de entrada
        System.out.print("Ingrese la edad: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            sc.next();
        }
        edad = sc.nextInt();

        String categoria = clasificarEdad(edad);

        System.out.println("La persona es: " + categoria);
    }
}