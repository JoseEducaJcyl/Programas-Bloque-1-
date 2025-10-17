import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        String invertida = ""; // Aquí guardaremos la cadena invertida
        
        // Recorremos la cadena desde el final hasta el principio
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i); // Añadimos cada carácter al nuevo string
        }
        
        System.out.println("Cadena invertida: " + invertida);
        scanner.close();
    }
}
