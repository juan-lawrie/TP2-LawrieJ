package resol_LawrieJ;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento (yyyy-MM-dd): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate today = LocalDate.now();

        // Próximo cumpleaños
        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println("Faltan " + daysUntilBirthday + " días para tu próximo cumpleaños.");
        scanner.close();
    }
}

