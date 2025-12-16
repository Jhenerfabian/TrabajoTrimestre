import java.util.Scanner;
public class Calculadora {
        public static double calcularDescuento(double montoCompra) {
            double descuento;
            if (montoCompra> 100000){
                descuento=montoCompra*0.15;
            } else if (montoCompra>=50000) {
                descuento = montoCompra*0.10;
            }else {
                descuento = montoCompra*0.05;
            }
            double preciofinal = montoCompra-descuento;
            return  preciofinal;
        }
        public static void main(String[] args) {
            Scanner  scanner = new Scanner(System.in);
            double monto;

            do {
                System.out.print("Ingrese el monto de la compra: ");
                monto = scanner.nextDouble();

                if (monto <= 0) {
                    System.out.println("Error: el monto debe ser mayor que cero.");
                }
            } while (monto <= 0);

            double resultado = calcularDescuento(monto);

            System.out.println("El precio final es: $" + resultado);

            scanner.close();
        }

}
