import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
         for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor:");
            numeros[i]=scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
