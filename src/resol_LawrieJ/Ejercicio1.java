package resol_LawrieJ;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha y hora (formato: yyyy-MM-ddTHH:mm):");
        String input1 = scanner.nextLine();
        LocalDateTime dateTime1 = LocalDateTime.parse(input1);

        System.out.println("Ingrese la segunda fecha y hora (formato: yyyy-MM-ddTHH:mm):");
        String input2 = scanner.nextLine();
        LocalDateTime dateTime2 = LocalDateTime.parse(input2);

        if (dateTime1.isAfter(dateTime2)) {
            System.out.println("La primera fecha y hora es mayor.");
        } else if (dateTime1.isBefore(dateTime2)) {
            System.out.println("La segunda fecha y hora es mayor.");
        } else {
            System.out.println("Ambas fechas y horas son iguales.");
        }

        scanner.close();
    }
}