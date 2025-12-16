import java.util.Scanner;
public class ConversorTemperatura {

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        double temp, resultado;

        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Celsius a Kelvin");
        System.out.println("4. Kelvin a Celsius");
        System.out.print("Elija una opción: ");

        // Validación de opción
        while (!sc.hasNextInt()) {
            System.out.print("Opción inválida. Ingrese un número: ");
            sc.next();
        }
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese temperatura en Celsius: ");
                temp = sc.nextDouble();
                resultado = celsiusAFahrenheit(temp);
                System.out.println(temp + "°C = " + resultado + "°F");
                break;

            case 2:
                System.out.print("Ingrese temperatura en Fahrenheit: ");
                temp = sc.nextDouble();
                resultado = fahrenheitACelsius(temp);
                System.out.println(temp + "°F = " + resultado + "°C");
                break;

            case 3:
                System.out.print("Ingrese temperatura en Celsius: ");
                temp = sc.nextDouble();
                resultado = celsiusAKelvin(temp);
                System.out.println(temp + "°C = " + resultado + "K");
                break;

            case 4:
                System.out.print("Ingrese temperatura en Kelvin: ");
                temp = sc.nextDouble();
                resultado = kelvinACelsius(temp);
                System.out.println(temp + "K = " + resultado + "°C");
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }
}