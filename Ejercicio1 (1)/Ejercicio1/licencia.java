import java.util.Scanner;

public class licencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad  = scanner.nextInt();
        if (edad >= 16){
            System.out.println("paso el examen?");
            String cond = scanner.next();
            if (cond.equals("si")&& edad >=16){
                System.out.println("su licencia esta activa");
            }
        }else {
            System.out.println("no puede");
        }
    }
}
