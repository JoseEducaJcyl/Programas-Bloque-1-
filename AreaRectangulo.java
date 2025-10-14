import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la altura: ");

        double altura = scanner.nextDouble();

        System.out.println("Introduce la base: "); 

        double base = scanner.nextDouble();

        double area = base * altura; 

        System.out.printf("El area rectangulo con base %.1f y altura %.1f es %.2f",base,altura,area);    }
}
