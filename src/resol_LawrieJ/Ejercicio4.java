package resol_LawrieJ;

public class Ejercicio4 {

    public static void main(String[] args) {
        java.time.LocalDate fechaNacimiento = java.time.LocalDate.of(2003, 8, 16); // Cambia la fecha a la tuya
        java.time.DayOfWeek diaSemana = fechaNacimiento.getDayOfWeek();
        String[] diasEspanol = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String diaSemanaEsp = diasEspanol[diaSemana.getValue() - 1];
        System.out.println("Naciste un " + diaSemanaEsp);
    }
}