import java.util.Scanner;

public class Fibionacci {
    public static void main(String[] args) {
        //importamos el scanner
        Scanner scanner = new Scanner(System.in);

        //Introducimos un numero que sera el valor de
        //la longitud del Array 
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        int[] numeros = new int[numero];
 
        //Inicializamos los primeros valores
        numeros[0] = 0;
        numeros[1] = 1;

        //Hacemos el calculo y lo imprimimos por pantalla
        for (int i = 2; i < numeros.length-1; i++) {
            numeros[i] = numeros[i-1] + numeros[i-2]; 
            System.out.print(numeros[i] + " ");
        }
    }
}
