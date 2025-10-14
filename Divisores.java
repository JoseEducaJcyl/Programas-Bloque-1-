import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = scanner.nextInt();

        int i;

        for (i = 1; i <= n; i++) {
            if(n % i == 0) {
            System.out.println("El numero " + n + " es divisible entre " + i);
            }    
        }
    }    
}
