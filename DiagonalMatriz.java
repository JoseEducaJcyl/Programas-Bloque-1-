public class DiagonalMatriz {
    public static void main(String[] args) {
        //Declaramos un matriz de numeros
        int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}};
        //Declaramos dos variables que guardaran el resultado de las sumas
        int sumaDiagonalA = 0;
        int sumaDiagonalB = 0; 
        //A traves de un for sumamos las diagonales 
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                sumaDiagonalA = numeros[0][0] + numeros[1][1] + numeros[2][2];
                sumaDiagonalB = numeros[0][2] + numeros[1][1] + numeros[2][0];  
            }
        }
        //Mostramos el resultado 
        System.out.println("La primera diagonal suma " + sumaDiagonalA + 
        " la suma de la segunda diagonal es " + sumaDiagonalB);
    }
}
