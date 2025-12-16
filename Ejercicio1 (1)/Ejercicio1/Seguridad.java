import java.util.Scanner;
public class Seguridad {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("es de noche?");
        String hora = scanner.next();
        if (hora.equals("si")){
            System.out.println("ya cerraste la puerta?");
            String puerta = scanner.next();
            if (puerta.equals("no")){
                System.out.println("asegura la puerta");
            }else
                System.out.println("todo en orden");
        }else
            System.out.println("todo en orden");
    }
}

