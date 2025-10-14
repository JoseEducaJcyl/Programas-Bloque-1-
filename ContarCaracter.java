import java.util.Scanner;

public class ContarCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        System.out.println("Introce unb caracter: ");
        char caracter = scanner.nextLine().charAt(0);
        contarVecesCaracter(caracter, cadena);
        scanner.close();
    }
    public static void contarVecesCaracter(char c,String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == c) {
                contador++;
            }
        }
        System.out.println("La cadena " + cadena + " tiene " + contador +
        " caracteres " + c);
    }
}
