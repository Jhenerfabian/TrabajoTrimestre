import java.util.Scanner;
 public class Prestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa la cantidad multas pendientes");
        int multa = scanner.nextInt();
        if ( multa < 0){
            System.out.println("se te presta el libro por 7 dias");
        }else
            System.out.println("no puede rentar libros");
    }
}

