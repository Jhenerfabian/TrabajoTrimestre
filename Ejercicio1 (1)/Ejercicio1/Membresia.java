import java.util.Scanner;

public class Membresia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eres premium ?");
        String miembrio = scanner.nextLine();
        if (miembrio.equalsIgnoreCase("si")){
            System.out.println("de cuanto es tu monto");
            int monto = scanner.nextInt();
            if (monto >= 50){
                System.out.println("envio gratis");
            }else{
                System.out.println("no tiene descuento");
            }
        } else {
            System.out.println("no aplica");
        }
    }
}
