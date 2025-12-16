import java.util.Scanner;
public class Express {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("elija una de las opciones");
        System.out.println("1 exprees");
        System.out.println("2 otra");
        String  express = sc.next();
        if (express.equals("1")){
            System.out.println("¿cuanto es su saldo?");
            int costoExtra = sc.nextInt();
            if (costoExtra >= 300)
                System.out.println("confirmado");


        }else
            System.out.println("envio estandar");
    }
}
