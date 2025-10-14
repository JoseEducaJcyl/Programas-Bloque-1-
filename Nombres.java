import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];

        System.out.println("Insertar tres nombres: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Valor");
            nombres[i] = scanner.nextLine();
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
    }
}
