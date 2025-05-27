package resol_LawrieJ;
import java.util.Scanner;

public class Ejercicio10 {
    Scanner scanner = new Scanner(System.in);

    public void metodo() {
        int alumnos;
        do {
            System.out.print("Inserte cantidad de alumnos (mínimo 10): ");
            alumnos = scanner.nextInt();
            if (alumnos < 10) {
                System.out.println("Debe ingresar al menos 10 alumnos.");
            }
        } while (alumnos < 10);

        String[] nombres = new String[alumnos];
        double[] notas = new double[alumnos];
        String[] resultados = new String[alumnos];

        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < alumnos; i++) {
            System.out.print("Ingrese el nombre del alumno #" + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            double nota;
            do {
                System.out.print("Ingrese la nota del alumno (0 - 10): ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Por favor, ingrese un número válido para la nota: ");
                    scanner.next();
                }
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
            resultados[i] = resultadoNota(nota);
            scanner.nextLine(); // Limpiar buffer
        }

        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < alumnos; i++) {
            System.out.println("El alumno " + nombres[i] + " tiene una nota de: " + notas[i] + " - " + resultados[i]);
        }
    }

    private String resultadoNota(double nota) {
        if (nota < 5) {
            return "suspenso";
        } else if (nota < 7) {
            return "bien";
        } else if (nota < 9) {
            return "notable";
        } else {
            return "sobresaliente";
        }
    }
}

