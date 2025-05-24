package resol_LawrieJ;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Ejercicio8 {

    public static void combustible() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de litros de combustible en el tanque: ");
        int litros_de_combustible_en_el_tanque = scanner.nextInt();
        
        double kmNormales = recorrer(litros_de_combustible_en_el_tanque);
        double kmDesiguales = recorrerCarreteraDesigual(litros_de_combustible_en_el_tanque);
    System.out.println("Puede recorrer " + kmNormales + " km en carreteras normales.");
    System.out.println("Puede recorrer " + new BigDecimal(kmDesiguales).setScale(2,RoundingMode.DOWN) + " km en carreteras desiguales.");
        scanner.close();
    }
    public static double recorrer(int litros){
        return (litros * 100.0) / 8.0;
    }


    public static double recorrerCarreteraDesigual(int litros){
        return (litros * 100.0) / 9.2;
    }
        
}
            


//Hacer dos metodos (ya estan creados) y una regla de tres simples para calcular el consumo total de combustible de un automovil si el automovil consume 8 litros cada cien kilometros.


