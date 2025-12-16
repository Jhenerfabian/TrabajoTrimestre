public class Suma1a5 {
    public static void main(String[] args) {

        int i = 1;
        int suma = 0;

        do {
            suma += i;
            i++;
        } while (i <= 5);

        System.out.println("La suma final es: " + suma);
    }
}
