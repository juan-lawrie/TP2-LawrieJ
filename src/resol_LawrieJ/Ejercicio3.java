package resol_LawrieJ;

public class Ejercicio3 {
    public static void main(String[] args) {
        String inicio = "07:00";
        String fin = "15:00";

        int horaInicio = 7;
        int minutoInicio = 0;
        int horaFin = 15;
        int minutoFin = 0;

        int minutosInicio = horaInicio * 60 + minutoInicio;
        int minutosFin = horaFin * 60 + minutoFin;

        int duracion = minutosFin - minutosInicio;

        System.out.println("La actividad empieza a las " + inicio + " y termina a las " + fin + ".");
        System.out.println("La jornada dura " + duracion + " minutos.");
    }
}
