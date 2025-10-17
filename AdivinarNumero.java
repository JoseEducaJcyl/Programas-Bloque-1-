import java.util.Random;
import java.util.Scanner;
public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Pedimos al usuario un numero 
        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();
        //Generamos un numero aleatorio entre 1 al 10
        int numeroAleatorio = random.nextInt(10) + 1;
        //El usuario entra en un bucle while he intenta adivinar el numero
        while (numero != numeroAleatorio) {
            if(numero < numeroAleatorio){
                System.out.println("Menor al numero a adivinar ");
                System.out.println("Ingresa un numero: ");
                numero = scanner.nextInt();
            }else {
                System.out.println("Mayor al numero a adivinar ");
                System.out.println("Ingresa un numero: ");
                numero = scanner.nextInt();
            }
        }
        //Mostramos el numero y felicitamos al usuario
        System.out.println("El numero aleatorio era " + numeroAleatorio +
        " Felicidades!");
        scanner.close();
    }
}
