public class SumaForEach {
    public static void main(String[] args) {

        int[] numeros = {2, 4, 6, 8, 10};
        int suma = 0;

        for (int num : numeros) {
            suma += num;
        }

        System.out.println("La suma total es: " + suma);
    }
}