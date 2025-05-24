package resol_LawrieJ;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el ejercicio a ejecutar (1-9):");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        switch (opcion) {
            case 1:
                Ejercicio1.main(new String[0]);
                break;
            case 2:
                Ejercicio2.main(new String[0]);
                break;
            case 3:
                Ejercicio3.main(new String[0]);
                break;
            case 4:
                Ejercicio4.main(new String[0]);
                break;
            case 5:
                Ejercicio5.main(new String[0]);
                break;
            case 6:
                Ejercicio6.main(new String[0]);
                break;
                case 7:
                    Ejercicio7.ejecutar();
                    break;
                    case 8:
                    Ejercicio8.combustible();
                    break;
                    case 9:
                    Ejercicio9.cuentaBilletes();
                    break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}