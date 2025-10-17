import java.util.Scanner;

public class FibonacciRecursivo {
    
    // Hacemos método para para generar la secuencia Fibonacci 
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        //Pedimos al usuario un numero que sea la cantidad de numeros que genere
        //el metodo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números de Fibonacci a generar: ");
        int n = scanner.nextInt();
        
        //Mostramos la secuencia
        System.out.println("Secuencia de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
}
