import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("cuantos años tiene");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("¿hay cupos?");
            String cupos = sc.next();
            if (cupos.equals("si")) {
                System.out.println("ingresa");
            } else
                System.out.println("no ingresa");
        }else
            System.out.println("no es permitido");
    }
}

