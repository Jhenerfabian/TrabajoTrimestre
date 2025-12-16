import java.util.Scanner;
public class SenaFormacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("=== PROGRAMAS DE FORMACIÓN SENA ===");
        System.out.println("1. ADSO – Análisis y Desarrollo de Software");
        System.out.println("2. Gestión Empresarial");
        System.out.println("3. Mantenimiento de Equipos de Cómputo");
        System.out.print("Seleccione un programa (1-3): ");
        int programa = sc.nextInt();


        System.out.print("Seleccione la modalidad (1 = Presencial, 2 = Virtual): ");
        int modalidad = sc.nextInt();

        System.out.println("\n=== RESULTADO ===");


        switch (programa) {

            case 1:
                System.out.println("Programa seleccionado: ADSO – Análisis y Desarrollo de Software");

                if (modalidad == 1) {
                    System.out.println("Modalidad: Presencial");
                    System.out.println("Duración estimada: 24 meses");
                    System.out.println("Jornada sugerida: Mañana");
                } else if (modalidad == 2) {
                    System.out.println("Modalidad: Virtual");
                    System.out.println("Duración estimada: 30 meses");
                    System.out.println("Jornada sugerida: Noche");
                } else {
                    System.out.println("Error: Modalidad no válida.");
                }
                break;

            case 2:
                System.out.println("Programa seleccionado: Gestión Empresarial");

                if (modalidad == 1) {
                    System.out.println("Modalidad: Presencial");
                    System.out.println("Duración estimada: 18 meses");
                    System.out.println("Jornada sugerida: Tarde");
                } else if (modalidad == 2) {
                    System.out.println("Modalidad: Virtual");
                    System.out.println("Duración estimada: 20 meses");
                    System.out.println("Jornada sugerida: Mañana");
                } else {
                    System.out.println("Error: Modalidad no válida.");
                }
                break;

            case 3:
                System.out.println("Programa seleccionado: Mantenimiento de Equipos de Cómputo");

                if (modalidad == 1) {
                    System.out.println("Modalidad: Presencial");
                    System.out.println("Duración estimada: 16 meses");
                    System.out.println("Jornada sugerida: Mañana");
                } else if (modalidad == 2) {
                    System.out.println("Modalidad: Virtual");
                    System.out.println("Duración estimada: 22 meses");
                    System.out.println("Jornada sugerida: Noche");
                } else {
                    System.out.println("Error: Modalidad no válida.");
                }
                break;

            default:
                System.out.println("Error: Programa seleccionado no válido.");
        }

        sc.close();
    }
}
