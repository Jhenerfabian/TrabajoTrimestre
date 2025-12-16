import java.util.Scanner;
public class RedSocial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su alias: ");
        String alias = sc.next();

        if (!alias.startsWith("@")) {
            System.out.println("Alias inválido: debe comenzar con '@'.");
        }
        else if (alias.length() < 4 || alias.length() > 15) {
            System.out.println("Alias inválido: la longitud debe ser entre 4 y 15 caracteres.");
        }
        else {
            System.out.println("Alias aceptado.");
        }

    }
}
