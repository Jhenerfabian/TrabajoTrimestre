import java.util.Scanner;
public class BateriaDispositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el porcentaje de la batería (0-100): ");
        int bateria = sc.nextInt();

        if (bateria < 20) {
            System.out.println("Cargar");
        } else if (bateria <= 80) {
            System.out.println("Batería suficiente");
        } else {
            System.out.println("Nivel alto");
        }

        sc.close();
    }
}

