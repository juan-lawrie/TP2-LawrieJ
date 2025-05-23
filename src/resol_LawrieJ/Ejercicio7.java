package resol_LawrieJ;
import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar(){
        
        Scanner scanner = new Scanner(System.in);
        int numeros = scanner.nextInt();
        char asterisco = '*';
        String cadena = "";
       
        for (int i = 0; i < numeros; i++) {
           cadena += asterisco;
        
           System.out.println(cadena);
        }
        scanner.close();
 }
}
