import java.util.Scanner;
import java.time.LocalDate;

public class EdadCien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actual = LocalDate.now().getYear();

        System.out.println("Introduzca anio de nacimiento: ");
        int anio_nac = scanner.nextInt();

        int edad_aprox = actual - anio_nac;
        System.out.println("Edad aproximada: " + edad_aprox);
        if (edad_aprox < 100) {
            System.out.println("Te faltan " + (100-edad_aprox) + " años para llegar a cien");
        }

    }
}
