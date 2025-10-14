import java.util.Scanner;

public class NombreEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola mi nombres es " + nombre.toUpperCase() + " y mi edad es: " + edad);
    }
}
