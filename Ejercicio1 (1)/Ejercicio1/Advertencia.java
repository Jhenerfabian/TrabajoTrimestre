import java.util.Scanner;
public class Advertencia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("emvia tu mensaje");
        String mensaje = scanner.next().toLowerCase();
        if ( mensaje.equalsIgnoreCase("Spoiler")) {
            System.out.println("advertido");
        }else
            System.out.println(mensaje);
    }
}
