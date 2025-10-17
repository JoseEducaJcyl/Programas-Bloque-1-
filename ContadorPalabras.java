import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedimos al usuario ingresar una frase
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        //La frase se guarda en un array, separando los espacios y
        //los saltos de linea
        String[] frase_partes = frase.split("\\s+|\\n");
        //Pedimos al usuario una palabra a buscar
        System.out.println("Ingresa una palabra a buscar: ");
        String palabra = scanner.nextLine();
        //Declaramos una variable contador
        int contador = 0;
        // Recorremos cada palabra del array y comparamos con la palabra a buscar
        // Si son iguales, incrementamos el contador
        for (String palabraB : frase_partes) {
            if (palabraB.equals(palabra)) {
                contador++;
            }
        }
        //Se muestra el resultado 
        System.out.println("La palabra " + palabra + " aparece " + 
        contador + " numero de veces en la frase");
        scanner.close();
    }
}
