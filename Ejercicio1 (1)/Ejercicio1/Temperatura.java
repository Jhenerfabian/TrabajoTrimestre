import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese tem");
        int tem = sc.nextInt();
        if (tem < 10) {
            System.out.println("esta frio");
        } else if (tem > 10 && tem <= 25) {
            System.out.println("es agradable");
        }else {
            System.out.println("hace calor");
        }
    }
}
