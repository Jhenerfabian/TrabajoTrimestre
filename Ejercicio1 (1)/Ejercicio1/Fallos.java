import java.util.Scanner;
public class Fallos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intentos = sc.nextInt();

        if (intentos == 3) {
            System.out.println("entra");
        }else
            System.out.println("sigue intentando");
        int intentos2 = sc.nextInt();

        if (intentos2 == 3) {
            System.out.println("entra");
        }else
            System.out.println("sigue intentando");{

        }
        int intentos3 = sc.nextInt();
        if (intentos3== 3) {
            System.out.println("entra");
        }else
            System.out.println("cuenta bloqueada");


    }
}
