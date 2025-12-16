import java.util.Scanner;
public class licencia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿tiene licencia?");
        String licencia = sc.next();
        if (licencia.equals("si")){
            System.out.println("¿esta vigente?");
            String vigente = sc.next();
            if (vigente.equals("si")){

            }else
                System.out.println("no puede");
            System.out.println("¿cumpleCategoria?");
            String categoria = sc.next();
            if (categoria.equals("si")){
                System.out.println("puede");
            }
            else{
                System.out.println("no puede");


            }


        }else
            System.out.println("no aplica");
    }
}
