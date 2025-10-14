import java.time.LocalDate;
import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un año de nacimiento: ");

        int anio = scanner.nextInt();
        
        int anioActual = LocalDate.now().getYear();

        if(anioActual-anio > 18) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }

    }
}