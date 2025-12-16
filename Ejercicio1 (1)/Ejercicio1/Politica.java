import java.util.Scanner;
public class Politica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿ trae mascota ?");
        String mascota = sc.next();
        if (mascota.equals("si")) {
            System.out.println("¿que tipo de mascota es?");
            String perro = sc.next();
            if (perro.equals("perro"))
                System.out.println("hay parque canino disponible");
            String otro = sc.next();
            if (otro.equals("otro"))
                System.out.println("bienvenido zona comun");
            String no = sc.next();

            if(no.equals("no"));
        }else
            System.out.println("entrar sin restricciones");
    }
}
