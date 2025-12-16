import java.util.Scanner;
public class Clima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pregunta por el clima si esta lloviendo -- nublado -- soleado ???");
        System.out.println("ingrese el clima segun las anteriores opciones   ");
        String clima = sc.next();
        if (clima.equals("lloviendo"))
            System.out.println("se recomienda paraguas");
        if (clima.equals("nublado"))
            System.out.println("se recomienda chaqueta ligera");
        if (clima.equals("soleado"))
            System.out.println("se recomienda bloqueador");

    }
}
