import java.util.Scanner;

public class MostrarInvertidos {
    public static void main(String[] args) {
        //Importamos el scanner
        Scanner scanner = new Scanner(System.in);
        //Le pedimos al usuario la dimension del array
        System.out.println("Inserte dimension del array ");
        int dimension = scanner.nextInt();
        int[] numeros = new int[dimension];
        //Le pedimos al usuario rellenar el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor: ");
            numeros[i]=scanner.nextInt();
        }
        //Imprimimos los valores de manera inversa
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        
    }
}
