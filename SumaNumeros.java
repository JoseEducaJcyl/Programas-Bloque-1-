import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        int suma_num = 0;
        while (num > 0) {
            suma_num = suma_num + num;
            num = scanner.nextInt();
        }
        System.out.println("La suma de los numeros es: " + suma_num);
        scanner.close();
    }    
}
