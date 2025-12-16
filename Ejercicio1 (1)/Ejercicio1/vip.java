import java.util.Scanner;

public class vip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eres vip?");
        String vip = scanner.nextLine();

        if (vip.equals("si")){
            System.out.println("tienes descuento");
        }
        else{
            System.out.println("tienes cupon?");
            String cupon = scanner.nextLine();
            if (cupon.equals("si")) {
                System.out.println("cantidad");
            }
            else {
                System.out.println("no aplica");
            }int cantidad = scanner.nextInt();
            if (cantidad >0){
                System.out.println("aplica descuento");

            }else
                System.out.println("no aplica");

        }

    }
}
