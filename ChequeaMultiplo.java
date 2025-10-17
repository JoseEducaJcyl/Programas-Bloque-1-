import java.util.Random;
import java.util.Scanner;

public class ChequeaMultiplo {
public void esMultiplo(int numero) { 
        Random random = new Random();

        // Genera un número aleatorio entre 1 y 10.
        int parametro = random.nextInt(10) + 1;

        System.out.println("El número aleatorio generado es: " + parametro);

        // Comprueba si el número ingresado es múltiplo del número aleatorio.
        if (numero % parametro == 0) {
            System.out.println("El número " + numero + " es múltiplo de " + parametro);
        } else {
            System.out.println("El número " + numero + " NO es múltiplo de " + parametro);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese un número.
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Crea un objeto de la clase y llama al método que realiza la comprobación.
        ChequeaMultiplo m = new ChequeaMultiplo();
        m.esMultiplo(numero);

        scanner.close();
    }
}

