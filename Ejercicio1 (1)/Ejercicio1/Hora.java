import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese hora");
        int hora = scanner.nextInt();
        if (hora >=0 && hora <12){
            System.out.println("buenos dias");
        } else if (hora >= 12 && hora <18) {
            System.out.println("buenas tardes");
        } else if (hora >= 18 && hora <=23) {
            System.out.println("buenas noches");
        }else
            System.out.println("no joda vaya duerma");
    }
}
