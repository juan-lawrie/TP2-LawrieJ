package resol_LawrieJ;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Fecha y hora actuales
        LocalDateTime ahora = LocalDateTime.now();

        // Fecha y hora del examen
        LocalDateTime fechaExamen = LocalDateTime.of(2025, Month.JUNE, 26, 19, 20);

        // Verificar si el examen ya ha pasado
        if (ahora.isAfter(fechaExamen)) {
            System.out.println("El examen ya ha pasado.");
            return;
        }

        // Calcular la duración entre ahora y la fecha del examen
        Duration duracion = Duration.between(ahora, fechaExamen);
        long dias = duracion.toDays();
        long horas = duracion.minusDays(dias).toHours();
        long minutos = duracion.minusDays(dias).minusHours(horas).toMinutes();

        System.out.println("Tiempo restante hasta el examen:");
        System.out.println(dias + " días, " + horas + " horas y " + minutos + " minutos.");

        // Calcular la cantidad de clases restantes (los jueves)
        LocalDate proximoJueves = ahora.toLocalDate().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        LocalDate fechaExamenFecha = fechaExamen.toLocalDate();

        long clasesRestantes = ChronoUnit.WEEKS.between(proximoJueves, fechaExamenFecha);

        System.out.println("Cantidad de clases restantes hasta el examen: " + clasesRestantes);
    }
}
