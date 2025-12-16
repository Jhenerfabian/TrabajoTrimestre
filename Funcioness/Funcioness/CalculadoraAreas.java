import java.util.Scanner;
public class CalculadoraAreas {

    public static double areaCirculo(double radio) {
        double PI = 3.14159;
        return PI * radio * radio;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        Scanner radio;
        double base;
        double altura;
        double area;

        System.out.println("=== CALCULADORA DE ÁREAS ===");
        System.out.println("1. Área del círculo");
        System.out.println("2. Área del rectángulo");
        System.out.println("3. Área del triángulo");
        System.out.print("Seleccione una opción: ");

        // Validación de opción
        while (!sc.hasNextInt()) {
            System.out.print("Opción inválida. Ingrese un número: ");
            sc.next();
        }
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                radio = sc;


        }
    }
}