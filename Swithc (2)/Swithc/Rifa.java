import java.util.Scanner;
public class Rifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int cantidad;
        int tarifa = 0;
        String tipo;
        System.out.println("bienvenido");
        System.out.println("--- Estos son el tipo de boleta ---");
        System.out.println("1. Boleta plata ");
        System.out.println("2. Boleta oro ");
        System.out.println("3. Boleta diamante ");
        opcion = sc.nextInt();
        System.out.println("ingrese la cantidad de boletas que desea");
        cantidad = sc.nextInt();


        switch (opcion){

            case 1:
                tipo = "Boleta plata";
                if (cantidad <= 4){
                    tarifa =  5000;
                }else if (cantidad >= 5) {
                    tarifa = 4500;
                }
                break;


            case 2:
                tipo = "Boleta oro ";
                if (cantidad <= 2){
                    tarifa =  10000;
                }else if (cantidad >= 3) {
                    tarifa = 9000;
                }

                break;

            case 3:
                tipo = "Boleta diamante ";
                if (cantidad == 1){
                    tarifa =  20000;
                }else if (cantidad >= 2) {
                    tarifa = 18000;
                }
                break;

            default:
                System.out.println("opcion invalida");
                return;
        }

        int total = tarifa * cantidad;

        System.out.println("---------------------------");
        System.out.println("Tipo: " + tipo);
        System.out.println("numero de boletas: " + cantidad);
        System.out.println("Tarifa por boleta: $" + tarifa);
        System.out.println("Total a pagar: $" + total);
        System.out.println("---------------------------");
    }
}
