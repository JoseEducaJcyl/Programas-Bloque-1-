public class Matriz3x3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0, j = 0; i < matriz.length && j < 
        matriz[i].length; i++,j++) {
            if(i == j) {
                matriz[i][j] = 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);                
            }
            System.out.println(" ");
        }
    }
}
