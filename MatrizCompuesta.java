import java.util.Scanner;

public class MatrizCompuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos dimensiones de la matriz
        System.out.print("Número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];


        //Declaramos una variable numero
        int numero = 1;

        // Se llena la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = numero++;
            }
        }

        // Se crea la matriz transpuesta
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Primero se muestra la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Despues se muestra la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
