import java.util.InputMismatchException;
import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int edad = 0;

        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        while (!entradaValida) {
            try {
            System.out.println("introduce tu edad: ");
            edad = scanner.nextInt();
            entradaValida = true;
            }catch(InputMismatchException e) {
                System.out.println("Entrada no valida");
                scanner.nextLine();
            }    
        }
        

        System.out.println("Introduce tu altura: ");
        double altura = scanner.nextFloat();

        System.out.println("¿Estudias?");
        boolean estudia = scanner.nextBoolean();

        System.out.printf("Nombre: %s \n",nombre);
        System.out.printf("Edad: %d años \n",edad);
        System.out.printf("Altura: %.2f m \n",altura);
        System.out.printf("¿Estudia?: %b",estudia);

        scanner.close();
    }
}
