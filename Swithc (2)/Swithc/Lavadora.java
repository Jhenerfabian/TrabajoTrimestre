import java.util.Scanner;
public class Lavadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion, horas;
        int tarifa = 0;
        String tipo = "";


        System.out.println("=== MENÚ DE LAVADORAS ===");
        System.out.println("1. Lavadora estándar");
        System.out.println("2. Lavadora grande");
        System.out.println("3. Lavadora industrial");
        System.out.print("Seleccione una opción (1-3): ");
        opcion = sc.nextInt();

        System.out.print("Ingrese el número de horas de alquiler: ");
        horas = sc.nextInt();


        switch (opcion) {

            case 1:
                tipo = "Lavadora estándar";
                if (horas <= 3) {
                    tarifa = 5000;
                } else {
                    tarifa = 4000;
                }
                break;

            case 2:
                tipo = "Lavadora grande";
                if (horas <= 3) {
                    tarifa = 7000;
                } else {
                    tarifa = 6000;
                }
                break;

            case 3:
                tipo = "Lavadora industrial";
                if (horas <= 3) {
                    tarifa = 10000;
                } else {
                    tarifa = 8000;
                }
                break;

            default:
                System.out.println("Opción inválida.");
                return;
        }


        int total = tarifa * horas;

        System.out.println("---------------------------");
        System.out.println("Tipo: " + tipo);
        System.out.println("Horas: " + horas);
        System.out.println("Tarifa por hora: $" + tarifa);
        System.out.println("Total a pagar: $" + total);
        System.out.println("---------------------------");
    }
}
