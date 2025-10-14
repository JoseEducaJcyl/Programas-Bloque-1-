import java.util.Scanner;

public class NumerosDel1al10F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce cuantos numeros quieres sumar: ");
        int n = scanner.nextInt();
        int suma = 0;
        double media;
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteracion: " + i);
            suma = suma + i;
        }
        media = suma / n;
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
    }   
}
