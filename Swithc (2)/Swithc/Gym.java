import java.util.Scanner;
public class Gym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plan;
        int meses;
        int tarifa = 0;
        String tipo;
        System.out.println("bienvenido");
        System.out.println("--- Estos son  nuestros planes ---");
        System.out.println("1. Plan Basico ");
        System.out.println("2. Plan Intermedio ");
        System.out.println("3. Plan Premium ");
        plan = sc.nextInt();
        System.out.println("ingrese los meses de suscripcion");
        meses = sc.nextInt();


        switch (plan){

            case 1:
                tipo = "Plan Basico";
                if (meses == 1){
                    tarifa =  30000;
                }else if (meses <= 3) {
                    tarifa = 80000;
                }else if (meses >= 6){
                    tarifa = 150000;
                }
                break;


            case 2:
                tipo = "Plan Intermedio ";
                if (meses == 1){
                    tarifa =  40000;
                }else if (meses <= 3) {
                    tarifa = 110000;
                }else if (meses >= 6){
                    tarifa = 200000;
                }
                break;

            case 3:
                tipo = "Plan Premium ";
                if (meses == 1){
                    tarifa =  60000;
                }else if (meses <= 3) {
                    tarifa = 160000;
                }else if (meses >= 6){
                    tarifa = 280000;
                }
                break;

            default:
                System.out.println("opcion invalida");
                return;
        }

        int total = tarifa * meses;

        System.out.println("---------------------------");
        System.out.println("Tipo: " + tipo);
        System.out.println("meses: " + meses);
        System.out.println("Tarifa por mes: $" + tarifa);
        System.out.println("Total a pagar: $" + total);
        System.out.println("---------------------------");
    }
}