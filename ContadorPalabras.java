import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        String[] frase_partes = frase.split("\\s+|\\n");
        System.out.println("Ingresa una palabra a buscar: ");
        String palabra = scanner.nextLine();
        int contador = 0;
        for (String palabraB : frase_partes) {
            if (palabraB.equals(palabra)) {
                contador++;
            }
        }
        System.out.println("La palabra " + palabra + " aparece " + 
        contador + " numero de veces en la frase");
        scanner.close();
    }
}
