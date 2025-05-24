package resol_LawrieJ;
import java.util.Scanner;
public class Ejercicio9 {
    Scanner scanner = new Scanner(System.in);
    public static void cuentaBilletes() {
        int[] billetes = {20000, 10000, 5000, 1000, 500, 200, 100, 50, 20, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto: ");
        int monto = scanner.nextInt();
        int cantidad = monto;
        for (int i = 0; i < billetes.length; i++) {
            int numBilletes = cantidad / billetes[i];
            if (numBilletes > 0) {
                System.out.println("Billetes de " + billetes[i] + ": " + numBilletes);
                cantidad = cantidad - numBilletes * billetes[i];
                scanner.close();
            }if (monto < 10) {
            System.out.println("Ingrese un monto igual o mayor a 10");
            return;
        }
        }
    }
}
