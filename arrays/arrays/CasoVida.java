import java.util.Scanner;
public class CasoVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al cajero");
        System.out.println("---------------------");
        System.out.println("ingrese su pin");
        sc.nextInt();

        int pinCorrecto = 1234;
        int pinIngresado = 0;

        while (pinIngresado != pinCorrecto) {
            pinIngresado = sc.nextInt();
            if (pinIngresado != pinCorrecto) {
                System.out.println("PIN incorrecto. Intente de nuevo.");
            }
        }

        System.out.println("PIN correcto. Accediendo a su cuenta");

    }
}
