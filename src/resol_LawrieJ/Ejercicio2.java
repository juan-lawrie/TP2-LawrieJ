package resol_LawrieJ;

import java.time.LocalDate;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Cambia la fecha de nacimiento según corresponda (AÑO, MES, DÍA)
        LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
        LocalDate hoy = LocalDate.now();

        int dias = 0;
        LocalDate fecha = fechaNacimiento;
        while (fecha.isBefore(hoy)) {
            fecha = fecha.plusDays(1);
            dias++;
        }

        System.out.println("Han pasado " + dias + " días desde tu nacimiento hasta hoy.");
    }
}