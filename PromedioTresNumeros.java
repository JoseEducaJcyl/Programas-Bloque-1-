import java.util.Scanner;

public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.println("Introduce el tercer numero: ");
        double n3 = scanner.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;

        System.out.printf("El promedio de los tres numeros seria: %.2f",promedio);
    }

}
