import java.util.Scanner;
public class Cine {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        if (edad >= 13){
            System.out.println("ver peliculas de mayor a 13 aqui las tengo para que me las beses");
        } else {
            System.out.println("sos muy  blanca");
        }
    }
}
